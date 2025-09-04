package TLE_CP_31_SHEET.CP.CP_31_1100;

import java.util.Arrays;
import java.util.Scanner;

public class RobinHoodInTown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            long sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }

            Arrays.sort(arr);

            if (n <= 2) {
                System.out.println(-1);
                continue;
            }

            int val = n / 2;
            long i = 0;
            long j = 1_000_000_000_000L;
            long ans = -1;

            while (i < j) {
                long mid = (i + j) / 2;
                long newSum = sum + mid;
                double avg = (double) newSum / (2 * n);

                if (avg > arr[val]) {
                    ans = mid;
                    j = mid;
                } else {
                    i = mid + 1;
                }
            }

            System.out.println(ans);
        }
    }
}
