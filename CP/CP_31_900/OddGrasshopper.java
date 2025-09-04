package TLE_CP_31_SHEET.CP.CP_31_900;

import java.util.Scanner;

public class OddGrasshopper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long x = sc.nextLong();
            long n = sc.nextLong();
            long rem = n % 4;

            if (x % 2 == 0) {
                if (rem == 1) x -= n;
                else if (rem == 2) x += 1;
                else if (rem == 3) x += n + 1;

            } else {
                if (rem == 1) x += n;
                else if (rem == 2) x -= 1;
                else if (rem == 3) x -= n + 1;

            }

            System.out.println(x);
        }
    }
}
