package TLE_CP_31_SHEET.CP.CP_31_1200;


import java.util.Scanner;

public class CatCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            if (n % 2 == 0) {
                if (k % n == 0) {
                    System.out.println(n);
                } else {
                    System.out.println(k % n);
                }
            } else {
                long val = n / 2 + 1;
                if (k < val) {
                    System.out.println(k);
                    continue;
                }
                long nv = (k - val) / (val - 1) + 1;
                long ans = (k + nv) % n;
                if (ans == 0) ans = n;
                System.out.println(ans);
            }
        }
    }
}
