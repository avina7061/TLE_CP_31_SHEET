package TLE_CP_31_SHEET.CP.CP_31_1100;

import java.util.ArrayList;
import java.util.Scanner;

public class CoPrime {

    public static int GCD(int m, int n) {
        if (n == 0) {
            return m;
        }
        return GCD(n, m % n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        ArrayList<Integer>[] coprime = new ArrayList[1001];
        for (int i = 1; i <= 1000; i++) {
            coprime[i] = new ArrayList<>();
        }

        for (int i = 1; i <= 1000; i++) {
            for (int j = 1; j <= 1000; j++) {
                if (GCD(i, j) == 1) {
                    coprime[i].add(j);
                }
            }
        }

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n + 1];
            int[] index = new int[1001];
            for (int i = 1; i <= n; i++) {
                arr[i] = sc.nextInt();
                index[arr[i]] = i;
            }

            int max = -1;
            for (int i = 1; i <= 1000; i++) {
                if (index[i] == 0) continue;
                for (int j : coprime[i]) {
                    if (index[j] != 0) {
                        max = Math.max(max, index[i] + index[j]);
                    }
                }
            }

            System.out.println(max);
        }
    }
}
