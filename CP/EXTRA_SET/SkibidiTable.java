package TLE_CP_31_SHEET.CP.EXTRA_SET;

import java.util.Scanner;

public class SkibidiTable {

    static long[] getCoordinate(long n, long d) {
        if (n == 1) {
            if (d == 1) return new long[]{1, 1};
            else if (d == 2) return new long[]{2, 2};
            else if (d == 3) return new long[]{2, 1};
            else return new long[]{1, 2}; // d == 4
        }

        long size = 1L << (n - 1);
        long block = size * size;

        if (d <= block) {
            long[] coord = getCoordinate(n - 1, d);
            return new long[]{coord[0], coord[1]};
        } else if (d <= 2 * block) {
            long[] coord = getCoordinate(n - 1, d - block);
            return new long[]{coord[0] + size, coord[1] + size};
        } else if (d <= 3 * block) {
            long[] coord = getCoordinate(n - 1, d - 2 * block);
            return new long[]{coord[0] + size, coord[1]};
        } else {
            long[] coord = getCoordinate(n - 1, d - 3 * block);
            return new long[]{coord[0], coord[1] + size};
        }
    }

    static long getNumber(long n, long x, long y) {
        if (n == 1) {
            if (x == 1 && y == 1) return 1;
            else if (x == 2 && y == 2) return 2;
            else if (x == 2 && y == 1) return 3;
            else return 4;
        }

        long size = 1L << (n - 1);
        long block = size * size;

        if (x <= size && y <= size) {
            return getNumber(n - 1, x, y);
        } else if (x > size && y > size) {
            return block + getNumber(n - 1, x - size, y - size);
        } else if (x > size && y <= size) {
            return 2 * block + getNumber(n - 1, x - size, y);
        } else {
            return 3 * block + getNumber(n - 1, x, y - size);
        }
    }

    static void solve(Scanner sc) {
        long n = sc.nextLong();
        long q = sc.nextLong();

        while (q-- > 0) {
            String t = sc.next();
            if (t.equals("->")) {
                long x = sc.nextLong();
                long y = sc.nextLong();
                System.out.println(getNumber(n, x, y));
            } else {
                long d = sc.nextLong();
                long[] coord = getCoordinate(n, d);
                System.out.println(coord[0] + " " + coord[1]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }
}
