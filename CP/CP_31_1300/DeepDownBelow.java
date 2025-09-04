package TLE_CP_31_SHEET.CP.CP_31_1300;

import java.util.ArrayList;
import java.util.Scanner;

public class DeepDownBelow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<long[][]> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int nt = sc.nextInt();
                long arr[] = new long[nt];
                long max = Long.MIN_VALUE;

                for (int j = 0; j < nt; j++) {
                    arr[j] = sc.nextLong();
                    if (j == 0) {
                        max = Math.max(max, arr[j] + 1);
                    } else {
                        max = Math.max(max, arr[j] - j+1);
                    }
                }

                long ar[][] = new long[1][2];
                ar[0][0] = max;
                ar[0][1] = nt;
                list.add(ar);
            }

            list.sort((a, b) -> Long.compare(a[0][0], b[0][0]));

            long val = list.get(0)[0][0];
            long mx = 0;
            long sum = val;

            for (int i = 1; i < list.size(); i++) {
                long[] prev = list.get(i - 1)[0];
                long[] curr = list.get(i)[0];

                sum += prev[1];

                if (curr[0] > sum) {
                    long diff = curr[0] - sum;
                    mx += diff;
                    sum += diff;
                }
            }

            System.out.println(val + mx);
        }
    }
}
