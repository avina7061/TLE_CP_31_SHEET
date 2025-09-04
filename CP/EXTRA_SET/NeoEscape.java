package TLE_CP_31_SHEET.CP.EXTRA_SET;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NeoEscape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            ArrayList<Long> b = new ArrayList<>();
            long last = -1;
            for (int i = 0; i < n; i++) {
                if (arr[i] != last) {
                    b.add(arr[i]);
                }
                last = arr[i];
            }

            n = b.size();
            long[][] dp = new long[n][2];
            for (int i = 0; i < n; i++) {
                dp[i][0] = b.get(i);
                dp[i][1] = i;
            }

            boolean[] bool = new boolean[n];
            Arrays.fill(bool, false);

            Arrays.sort(dp, (a, c) ->Long.compare(c[0], a[0]));


            int cnt = 0;
            for (int i = 0; i < dp.length; i++) {
                int ind = (int) dp[i][1];
                if (!bool[ind]) {
                    if (ind > 0 && bool[ind - 1]) {
                        bool[ind] = true;
                    } else if (ind < n - 1 && bool[ind + 1]) {
                        bool[ind] = true;
                    } else {
                        cnt++;
                        bool[ind] = true;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
