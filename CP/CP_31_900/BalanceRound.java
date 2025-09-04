package TLE_CP_31_SHEET.CP.CP_31_900;

import java.util.Arrays;
import java.util.Scanner;

public class BalanceRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            long arr[]= new long[n];
            for(int i=0; i<n; i++){
                arr[i]= sc.nextInt();
            }
            Arrays.sort(arr);
            int max =Integer.MIN_VALUE;
            int cnt=1;
            for(int i=1;i<n; i++){
                if(arr[i]-arr[i-1]<=k){
                    cnt++;
                }
                else{
                    max=Math.max(max,cnt);
                    cnt=1;
                }
            }
            max=Math.max(cnt,max);
            System.out.println((max==Integer.MIN_VALUE ? 0: n-max));
        }
    }
}
