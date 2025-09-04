package TLE_CP_31_SHEET.CP.CP_31_900;

import java.util.Scanner;

public class LuntikAndSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            long cnt1 = 0;
            long cnt0 = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 0) {
                    cnt0++;
                }
                if (arr[i] == 1) {
                    cnt1++;
                }
            }
            long val = 1L << cnt0; // equivalent to 2^cnt0 using bit shift
            long ans = cnt1 * val;
            System.out.println(ans);
        }
    }
}
