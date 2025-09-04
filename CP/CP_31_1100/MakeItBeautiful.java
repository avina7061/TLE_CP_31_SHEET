package TLE_CP_31_SHEET.CP.CP_31_1100;

import java.util.Scanner;

public class MakeItBeautiful {

    public static long[] pow2 = new long[61];
    static {
        for (int i = 0; i <= 60; i++) {
            pow2[i] = 1L << i;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
       while(t-->0){
           int n = sc.nextInt();
           long k = sc.nextLong();
           long[] arr = new long[n];

           for (int i = 0; i < n; i++) {
               arr[i] = sc.nextLong();
           }

           long ans = 0;
           for (int i = 0; i < n; i++) {
               ans += Long.bitCount(arr[i]);;
           }

           for (int i = 0; pow2[i]<=k; i++) {
               long cost = pow2[i];
               for (int j = 0; j < n; j++) {
                   boolean isZero = ((arr[j] >> i) & 1) == 0;

                   if (isZero && k >= cost) {
                       k -= cost;
                       ans++;
                   }
               }
           }

           System.out.println(ans);
       }
    }
}
