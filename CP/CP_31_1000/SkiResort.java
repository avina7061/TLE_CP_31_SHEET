package TLE_CP_31_SHEET.CP.CP_31_1000;

import java.util.Scanner;

public class SkiResort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long q = sc.nextLong();
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            int i = 0;
            int j = 0;
            long sum = 0;
            while (j < n) {
                if (arr[j] <= q) {
                    j++;
                } else {

                    if (k <= (j - i)) {
                        long len = j - i;

                        sum += (len - k + 1) * (len - k + 2) / 2;
                    }
                    i = j + 1;
                    j++;
                }
            }

            if (k <= (j - i)) {
                long len = j - i;
                sum += (len - k + 1) * (len - k + 2) / 2;
            }

            System.out.println(sum);
        }
    }
}
