package TLE_CP_31_SHEET.CP.CP_31_1100;

import java.util.Scanner;

public class LunaticNeverContent {
    public static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long arr[]= new long[n];
            for(int i=0; i<n; i++){
                arr[i]= sc.nextLong();
            }
            int i=0;
            int j=n-1;
            long ans=0;
            while(i<j){
                ans=gcd(ans,Math.abs(arr[i]-arr[j]));
                i++;
                j--;
            }
                System.out.println(ans);
        }
    }
}
