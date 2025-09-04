package TLE_CP_31_SHEET.CP.CP_31_1100;

import java.util.Scanner;

public class EatingCandies2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i]= sc.nextInt();
            }
            int prefixSum[] = new int[n];
            int suffixSum[] = new int[n];
            prefixSum[0]=arr[0];
            suffixSum[n-1]=arr[n-1];
            for(int i=1; i<n; i++){
                prefixSum[i]=prefixSum[i-1]+arr[i];
                suffixSum[n-1-i]=suffixSum[n-i]+arr[n-1-i];
            }
            int i=0;
            int j=n-1;
            int max=0;
            while(i<j){
                if(prefixSum[i]<suffixSum[j]){
                    i++;
                }
                else if(suffixSum[j]<prefixSum[i]){
                    j--;
                }
                else{
                    max=Math.max(max,i+1+n-j);
                    i++;
                    j--;
                }

            }
            System.out.println(max);
        }
    }
}
