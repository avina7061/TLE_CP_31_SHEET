package TLE_CP_31_SHEET.CP.CP_31_1300;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class MoveAndTurn {
    public static void solve(HashSet<String> set, int n, String s, int x, int y,HashMap<String,Integer>mp) {
        if (n == 0) {
            set.add(x + "," + y);
            return;
        }
        String key =x + "," + y + "," + n + "," + s;
if (mp.containsKey(key))return;
mp.put(key,set.size());
        if (s.equals("centre")) {
            solve(set, n - 1, "top", x, y + 1,mp);
            solve(set, n - 1, "right", x + 1, y,mp);
            solve(set, n - 1, "bottom", x, y - 1,mp);
            solve(set, n - 1, "left", x - 1, y,mp);
        }
       else if (s.equals("top")) {
            solve(set, n - 1, "right", x + 1, y,mp);
            solve(set, n - 1, "left", x - 1, y,mp);
        }
       else if (s.equals("right")) {
            solve(set, n - 1, "top", x, y + 1,mp);
            solve(set, n - 1, "bottom", x, y - 1,mp);
        }
       else if (s.equals("bottom")) {
            solve(set, n - 1, "right", x + 1, y,mp);
            solve(set, n - 1, "left", x - 1, y,mp);
        }
       else if (s.equals("left")) {
            solve(set, n - 1, "top", x, y + 1,mp);
            solve(set, n - 1, "bottom", x, y - 1,mp);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<String> set = new HashSet<>();
        HashMap<String,Integer>mp = new HashMap<>();
        solve(set, n, "centre", 0, 0,mp);
        System.out.println(set.size());
    }
}
