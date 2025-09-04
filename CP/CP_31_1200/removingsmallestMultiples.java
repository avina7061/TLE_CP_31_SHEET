package TLE_CP_31_SHEET.CP.CP_31_1200;

import java.util.Scanner;

public class removingsmallestMultiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            boolean[] deleted = new boolean[n + 1];
            long totalCost = 0;

            for (int k = 1; k <= n; k++) {

                    for (int multiple = k; multiple <= n; multiple += k) {
                        if (s.charAt(multiple - 1) == '1') {
                            break;
                        }
                        if (!deleted[multiple]) {
                            deleted[multiple] = true;
                            totalCost += k;
                        }
                    }

            }
            System.out.println(totalCost);
        }
    }
}