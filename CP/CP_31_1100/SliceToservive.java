package TLE_CP_31_SHEET.CP.CP_31_1100;

import java.util.Scanner;

public class SliceToservive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while (tt-- > 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            if ((n + 1 - a) < a)
                a = n + 1 - a;
            if ((m + 1 - b) < b) {
                b = m + 1 - b;
            }
            System.out.println(Math.min(1 + cnt(n) + cnt(b), 1 + cnt(m) + cnt(a)));
        }
    }


    public static long cnt(long x) {
        long y = 0;
        while (x > 1) {
            x = (x + 1) / 2;
            y++;
        }
        return y;
    }
}
