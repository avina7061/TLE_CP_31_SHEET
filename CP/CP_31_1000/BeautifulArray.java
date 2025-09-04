package TLE_CP_31_SHEET.CP.CP_31_1000;

import java.util.Scanner;

public class BeautifulArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long b = sc.nextLong();
            long s = sc.nextLong();
            long arr[] = new long[n];

            if (s == 0 && b == 0) {
                for (int i = 0; i < n; i++) {
                    System.out.print(0 + " ");
                }
                System.out.println();
                continue;
            }

            long minRequired = k * b;
            long maxPossible = k * b + (k - 1) * n;

            if (s < minRequired || s > maxPossible) {
                System.out.println(-1);
                continue;
            }

            arr[0] = minRequired;
            s -= minRequired;

            for (int i = 0; i < n && s > 0; i++) {
                long add = Math.min(s, k - 1);
                arr[i] += add;
                s -= add;
            }

            for (long i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
