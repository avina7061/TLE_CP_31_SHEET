package TLE_CP_31_SHEET.CP.CP_31_900;

import java.util.Scanner;

public class OddDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();

            if (n == 1) {
                System.out.println("No");
            } else if ((n & (n - 1)) == 0) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}
