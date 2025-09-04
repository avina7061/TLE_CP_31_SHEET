package TLE_CP_31_SHEET.CP.EXTRA_SET;

import java.util.Arrays;
import java.util.Scanner;

public class ComeALittleCloser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long dp[][] = new long[n][3]; // store x, y, index
            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();
                long y = sc.nextLong();
                dp[i][0] = x;
                dp[i][1] = y;
                dp[i][2] = i;
            }
            if (n == 1) {
                System.out.println(1);
                continue;
            }
            if (n == 2) {
                System.out.println(2);
                continue;
            }

            long dp2[][] = new long[n][3];
            for (int i = 0; i < n; i++) {
                dp2[i][0] = dp[i][0];
                dp2[i][1] = dp[i][1];
                dp2[i][2] = dp[i][2];
            }

            Arrays.sort(dp, (a, b) -> Long.compare(a[0], b[0]));
            Arrays.sort(dp2, (a, b) -> Long.compare(a[1], b[1]));

            long l = dp[n - 1][0] - dp[0][0] + 1;
            long w = dp2[n - 1][1] - dp2[0][1] + 1;
            long ans = l * w;

            if (dp[0][0] != dp[1][0]) {
                int removeIdx = (int) dp[0][2];
                long minX = dp[1][0];
                long maxX = dp[n - 1][0];
                long minY = Long.MAX_VALUE, maxY = Long.MIN_VALUE;
                for (long[] point : dp2) {
                    if (point[2] != removeIdx) {
                        minY = Math.min(minY, point[1]);
                        maxY = Math.max(maxY, point[1]);
                    }
                }
                long len = maxX - minX + 1;
                long wid = maxY - minY + 1;
                long val = len * wid;
                if (val == n - 1) ans = Math.min(ans, val + Math.min(len, wid));
                else ans = Math.min(ans, val);
            }

            if (dp[n - 1][0] != dp[n - 2][0]) {
                int removeIdx = (int) dp[n - 1][2];
                long minX = dp[0][0];
                long maxX = dp[n - 2][0];
                long minY = Long.MAX_VALUE, maxY = Long.MIN_VALUE;
                for (long[] point : dp2) {
                    if (point[2] != removeIdx) {
                        minY = Math.min(minY, point[1]);
                        maxY = Math.max(maxY, point[1]);
                    }
                }
                long len = maxX - minX + 1;
                long wid = maxY - minY + 1;
                long val = len * wid;
                if (val == n - 1) ans = Math.min(ans, val + Math.min(len, wid));
                else ans = Math.min(ans, val);
            }

            if (dp2[0][1] != dp2[1][1]) {
                int removeIdx = (int) dp2[0][2];
                long minY = dp2[1][1];
                long maxY = dp2[n - 1][1];
                long minX = Long.MAX_VALUE, maxX = Long.MIN_VALUE;
                for (long[] point : dp) {
                    if (point[2] != removeIdx) {
                        minX = Math.min(minX, point[0]);
                        maxX = Math.max(maxX, point[0]);
                    }
                }
                long len = maxX - minX + 1;
                long wid = maxY - minY + 1;
                long val = len * wid;
                if (val == n - 1) ans = Math.min(ans, val + Math.min(len, wid));
                else ans = Math.min(ans, val);
            }

            if (dp2[n - 1][1] != dp2[n - 2][1]) {
                int removeIdx = (int) dp2[n - 1][2];
                long minY = dp2[0][1];
                long maxY = dp2[n - 2][1];
                long minX = Long.MAX_VALUE, maxX = Long.MIN_VALUE;
                for (long[] point : dp) {
                    if (point[2] != removeIdx) {
                        minX = Math.min(minX, point[0]);
                        maxX = Math.max(maxX, point[0]);
                    }
                }
                long len = maxX - minX + 1;
                long wid = maxY - minY + 1;
                long val = len * wid;
                if (val == n - 1) ans = Math.min(ans, val + Math.min(len, wid));
                else ans = Math.min(ans, val);
            }

            System.out.println(ans);
        }
    }
}
