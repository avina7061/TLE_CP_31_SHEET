package TLE_CP_31_SHEET.CP.CP_31_1100;

import java.util.Arrays;
import java.util.Scanner;

public class CollectingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[][] v = new long[n][2];

            for (int i = 0; i < n; i++) {
                v[i][0] = sc.nextLong();
                v[i][1] = i;
            }

            Arrays.sort(v, (a, b) -> Long.compare(a[0], b[0]));

            long[] prefix = new long[n];
            prefix[0] = v[0][0];
            for (int i = 1; i < n; i++) {
                prefix[i] = prefix[i - 1] + v[i][0];
            }

            long[] ans = new long[n];
            for (int i = 0; i < n; i++) {
                int j = i;
                int found = i;

                while (j < n) {
                    long target = prefix[j]+1;
                    int idx = upperBound(v, target);
                    idx--;
                    if (idx == j) break;
                    found += (idx - j);
                    j = idx;
                }

                int originalIndex = (int) v[i][1];
                ans[originalIndex] = found;
            }

            for (long x : ans) System.out.print(x + " ");
            System.out.println();
        }
    }

    private static int upperBound(long[][] arr, long val) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid][0] < val) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
