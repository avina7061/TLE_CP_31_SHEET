package TLE_CP_31_SHEET.CP.CP_31_1000;

import java.util.Arrays;
import java.util.Scanner;

public class DivanAndANewProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            long[][] building = new long[n][2];
            for (int i = 0; i < n; i++) {
                building[i][0] = a[i];
                building[i][1] = i;
            }

            Arrays.sort(building, (x, y) -> Long.compare(y[0], x[0]));

            long[] ans = new long[n + 1];
            long minutes = 0;
            long coord = 1;

            for (int i = 0; i < n; i++) {
                int idx = (int) building[i][1];
                long val = building[i][0];

                ans[idx + 1] = coord;
                minutes += 2 * Math.abs(coord) * val;

                if (coord < 0)
                    coord = Math.abs(coord) + 1;
                else
                    coord = -coord;
            }

            System.out.println(minutes);
            for (long x : ans)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}
