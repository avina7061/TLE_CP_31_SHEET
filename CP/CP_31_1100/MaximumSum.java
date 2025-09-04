package TLE_CP_31_SHEET.CP.CP_31_1100;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            long arr[] = new long[n];
            long prefixSum[]= new long[n+1];
            for(int i=0; i<n; i++){
                arr[i]= sc.nextLong();
            }
            Arrays.sort(arr);
            prefixSum[0]=0;
            prefixSum[1]=arr[0];
            for(int i=1; i<n; i++){
                prefixSum[i+1]=arr[i]+prefixSum[i];
            }
            long max=Integer.MIN_VALUE;
            for(int i=0; i<=k; i++){
                long val=prefixSum[n-k+i]-prefixSum[2*i];
                max=Math.max(max,val);
            }
            System.out.println(max);
        }
    }
}
