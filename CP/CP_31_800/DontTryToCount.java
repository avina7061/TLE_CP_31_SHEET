package TLE_CP_31_SHEET.CP.CP_31_800;

import java.util.Scanner;

public class DontTryToCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();
            String s = sc.next();

            int cnt = 0;
            while (x.indexOf(s) == -1&&x.length()<32) {
                x+=x;
                cnt++;
                if (cnt > m+2) {
                    break;
                }
            }
            if (x.indexOf(s) == -1) {
                System.out.println(-1);
            } else {
                System.out.println(cnt);
            }
        }
    }
}
