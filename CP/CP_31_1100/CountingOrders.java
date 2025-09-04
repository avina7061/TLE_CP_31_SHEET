package TLE_CP_31_SHEET.CP.CP_31_1100;

import java.util.Arrays;
import java.util.Scanner;

public class CountingOrders {
    static final int MOD = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextLong();
            }
            Arrays.sort(a);
            Arrays.sort(b);
            long ans = 1;
            int j = 0;
            for (int i = 0; i < n; i++) {
                while (j < n && a[i] > b[j]) {
                    j++;
                }
                long choices = j - i;
                if (choices <= 0) {
                    ans = 0;
                    break;
                }
                ans = (ans * choices) % MOD;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}