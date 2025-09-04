package TLE_CP_31_SHEET.CP.CP_31_900;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class TheSecretNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String n = sc.next();
            HashSet<Character> set = new HashSet<>();
            StringBuilder sb2 = new StringBuilder(n);
            int cnt = 0;

            // remove trailing zeros
            for (int i = n.length() - 1; i >= 0; i--) {
                if (sb2.charAt(i) == '0') {
                    cnt++;
                    sb2.deleteCharAt(i);
                } else {
                    break;
                }
            }
            n = sb2.toString();

            String s = "";
            for (char i : n.toCharArray()) {
                int sz = set.size();
                set.add(i);
                if (set.size() == sz) {
                    break;
                }
                s += i;
            }

            int i = 0;
            int j = s.length();
            boolean belabeta = false;
            while (j <= n.length()) {
                if (!n.substring(i, j).equals(s)) {
                    belabeta = true;
                    break;
                }
                i += s.length();
                j += s.length();
            }

            if (n.length() % 2 != 0 || belabeta) {
                System.out.println(0);
                continue;
            }

            ArrayList<String> list = new ArrayList<>();
            for (int k = s.length(); k <= n.length() / 2; k += s.length()) {
                if (n.length() % k == 0 && (n.length() / k) % 2 == 0) {
                    int x = n.length() / k;
                    StringBuilder sb = new StringBuilder();
                    boolean b = true;
                    String p = "0".repeat(k);

                    StringBuilder c = new StringBuilder();
                    for (int z = s.length(); z <= k; z += s.length()) {
                        c.append(s);
                    }

                    while (x > 0) {
                        if (b) {
                            sb.append(c);
                            b = false;
                        } else {
                            sb.append(p);
                            b = true;
                        }
                        x--;
                    }

                    // re-attach trailing zeros
                    StringBuilder lkc = new StringBuilder();
                    for (int y = 0; y < cnt; y++) {
                        lkc.append("0");
                    }
                    list.add(sb.reverse().toString() + lkc);
                }
            }

            if (list.isEmpty()) {
                System.out.println(0);
            } else {
                ArrayList<BigInteger> li = new ArrayList<>();
                for (String kt : list) {
                    li.add(new BigInteger(kt));
                }
                Collections.sort(li);

                System.out.println(li.size());
                for (int idx = 0; idx < li.size(); idx++) {
                    System.out.print(li.get(idx));
                    if (idx < li.size() - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
