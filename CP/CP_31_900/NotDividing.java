package TLE_CP_31_SHEET.CP.CP_31_900;

import java.util.Scanner;

public class NotDividing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            if (arr[0] == 1) arr[0]++;

            for (int i = 1; i < n; i++) {
                if (arr[i] == 1) arr[i]++;

                while (arr[i] % arr[i - 1] == 0) {
                    arr[i]++;
                }
            }

            for (long num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
