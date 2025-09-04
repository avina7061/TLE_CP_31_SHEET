package TLE_CP_31_SHEET.CP.CP_31_1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LiHuaAndPattern {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int[][] arr = new int[n][n];

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            long cnt = 0;
            int m = (n % 2 == 0) ? n / 2 : n / 2 + 1;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (n % 2 != 0&&i==n/2) {
                        if (j < n - 1 - j && arr[i][j] != arr[n - 1 - i][n - 1 - j]) {
                            cnt++;
                        }
                    } else {
                        if (arr[i][j] != arr[n - 1 - i][n - 1 - j]) {
                            cnt++;
                        }
                    }
                }
            }

            if (cnt > k) {
                System.out.println("No");
            } else {
                if (cnt == k || (k - cnt) % 2 == 0 || n % 2 == 1) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }
}
