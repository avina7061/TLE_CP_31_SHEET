package TLE_CP_31_SHEET.CP.CP_31_1000;

import java.util.Scanner;

public class LukelsAFood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long x = sc.nextLong();
            long[] a = new long[(int)n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            long[][] segments = new long[(int)n][2];
            for (int i = 0; i < n; i++) {
                segments[i][0] = a[i] - x;
                segments[i][1] = a[i] + x;
            }

            long ans = 0;
            long l = segments[0][0];
            long r = segments[0][1];

            for (int i = 1; i < n; i++) {
                l = Math.max(l, segments[i][0]);
                r = Math.min(r, segments[i][1]);

                if (l > r) {
                    ans++;
                    l = segments[i][0];
                    r = segments[i][1];
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
