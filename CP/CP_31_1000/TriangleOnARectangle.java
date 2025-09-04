package TLE_CP_31_SHEET.CP.CP_31_1000;

import java.util.Scanner;

public class TriangleOnARectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int w = sc.nextInt();
            int h = sc.nextInt();

            long maxArea = 0;

            int a = sc.nextInt();
            int[] a1 = new int[a];
            for (int i = 0; i < a; i++) a1[i] = sc.nextInt();
            maxArea = Math.max(maxArea, 1L * (a1[a - 1] - a1[0]) * h);

            int b = sc.nextInt();
            int[] b1 = new int[b];
            for (int i = 0; i < b; i++) b1[i] = sc.nextInt();
            maxArea = Math.max(maxArea, 1L * (b1[b - 1] - b1[0]) * h);

            int c = sc.nextInt();
            int[] c1 = new int[c];
            for (int i = 0; i < c; i++) c1[i] = sc.nextInt();
            maxArea = Math.max(maxArea, 1L * (c1[c - 1] - c1[0]) * w);

            int d = sc.nextInt();
            int[] d1 = new int[d];
            for (int i = 0; i < d; i++) d1[i] = sc.nextInt();
            maxArea = Math.max(maxArea, 1L * (d1[d - 1] - d1[0]) * w);

            System.out.println(maxArea);
        }
    }
}
