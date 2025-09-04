package TLE_CP_31_SHEET.CP.CP_31_1300;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MakeAPalindrome {
    static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Long> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a.add(sc.nextLong());
        }

        if (k == 1) {
            System.out.println("Yes");
            return;
        }

        List<Long> b = new ArrayList<>(a);
        Collections.sort(b);

        long lim = b.get(k - 1);
        List<Long> c = new ArrayList<>();
        for (long i : a) {
            if (i <= lim) c.add(i);
        }

        int del = c.size() - k + 1;
        int l = 0, r = c.size() - 1;

        while (l < r) {
            if (!c.get(l).equals(c.get(r))) {
                if (del == 0) {
                    System.out.println("No");
                    return;
                }
                if (c.get(l) == lim && del > 0) {
                    del--;
                    l++;
                } else if (c.get(r) == lim && del > 0) {
                    del--;
                    r--;
                } else {
                    System.out.println("No");
                    return;
                }
                continue;
            }
            l++;
            r--;
        }

        System.out.println("Yes");
    }

    public static void main(String[] args) {
        int t = 1;
        t = sc.nextInt();

        while (t-- > 0) {
            solve();
        }
    }
}
