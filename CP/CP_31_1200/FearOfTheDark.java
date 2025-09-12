package TLE_CP_31_SHEET.CP.CP_31_1200;

import java.util.Scanner;

public class FearOfTheDark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();

            int a1 = sc.nextInt();
            int a2 = sc.nextInt();

            int b1 = sc.nextInt();
            int b2 = sc.nextInt();

            double max = Math.max(
                    Math.sqrt(b1 * b1 + b2 * b2),
                    Math.sqrt((b1 - p1) * (b1 - p1) + (b2 - p2) * (b2 - p2))
            );

            double dist = max;
            double left = 0;
            double right = max;
            double ans = 0;
            double maxi1 = Math.max(
                    Math.sqrt(a1 * a1 + a2 * a2),
                    Math.sqrt((a1 - p1) * (a1 - p1) + (a2 - p2) * (a2 - p2))
            );

            double maxi2 = Math.max(
                    Math.sqrt(b1 * b1 + b2 * b2),
                    Math.sqrt((b1 - p1) * (b1 - p1) + (b2 - p2) * (b2 - p2))
            );

            double single1 = Math.min(
                    Math.sqrt((b1 - p1) * (b1 - p1) + (b2 - p2) * (b2 - p2)),
                    Math.sqrt((a1 - p1) * (a1 - p1) + (a2 - p2) * (a2 - p2))
            );

            double single2 = Math.min(
                    Math.sqrt(a1 * a1 + a2 * a2),
                    Math.sqrt(b1 * b1 + b2 * b2)
            );
//            System.out.println("left "+left);
//            System.out.println("right "+right);
            while (right - left > 1e-12) {
                double mid = (left + right) / 2.0;

                if (mid >= maxi1) {
                    ans = mid;
                    right = mid;
                } else if (mid >= maxi2) {
                    ans = mid;
                    right = mid;
                } else if (single1 <= mid && single2 <= mid) {
                    double dis = Math.sqrt((b1 - a1) * (b1 - a1) + (b2 - a2) * (b2 - a2));
                    if (dis <= 2 * mid) {
                        ans = mid;
                        right = mid;
                    } else {
                        left = mid;
                    }
                } else {
                    left = mid;
                }
//                System.out.println("left "+left);
//                System.out.println("right "+right);
            }
            System.out.println(Math.max(ans,right));

        }
    }
}
