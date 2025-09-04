package TLE_CP_31_SHEET.CP.CP_31_1300;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AlyonaAndNarrowFridge2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int h = sc.nextInt();

        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }

        int low = 0, high = n - 1, ans = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i <= mid; i++) {
                temp.add(v[i]);
            }

            Collections.sort(temp);

            long heightRequired = 0;
            int p = mid;
            while (p >= 0) {
                heightRequired += temp.get(p);
                p -= 2;
                if (heightRequired > h) break;
            }

            if (heightRequired > h) {
                high = mid - 1;
            } else {
                ans = mid;
                low = mid + 1;
            }
        }

        System.out.println(ans + 1);
    }
}
