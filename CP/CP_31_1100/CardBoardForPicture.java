package TLE_CP_31_SHEET.CP.CP_31_1100;

import java.util.Scanner;

public class CardBoardForPicture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long c = sc.nextLong();
            long[] s = new long[n];
            for (int i = 0; i < n; i++) {
                s[i] = sc.nextLong();
            }

            long left = 0;
            long right = (long) Math.sqrt(c) + 1;
            long ans = 0;

            while (left <= right) {
                long mid = left + (right - left) / 2;
                long sum = 0;
                for (int i = 0; i < n; i++) {
                    long term = s[i] + 2 * mid;
                    sum += term * term;
                    if (sum > c || sum < 0) {
                        break;
                    }
                }
                if (sum > c) {
                    right = mid - 1;
                } else if (sum < c) {
                    left = mid + 1;
                } else {
                    ans = mid;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}