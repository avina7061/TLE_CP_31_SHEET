package TLE_CP_31_SHEET.CP.CP_31_1300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DigitalStringMaximization {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String s = br.readLine();
            char arr[] = s.toCharArray();
            int n = arr.length;

            for (int i = 0; i < n; i++) {
                int m = -1;
                int maxDiff = Integer.MIN_VALUE;
                int val = arr[i] - '0' + 2;
                int l = 0;

                for (int j = i + 1; j <= i + 7 && j < n; j++) {
                    l++;
                    if (arr[j] - '0' < val) {
                        val++;
                        continue;
                    }

                    int diff = (arr[j] - '0') - l;

                    if (diff > maxDiff) {
                        maxDiff = diff;
                        m = j;
                    }

                    val++;
                }

                if (m != -1 && maxDiff > 0) {
                    if (maxDiff < 10) {
                        int v = maxDiff;
                        char last = (char) (v + '0');
                        for (int k = m; k > i; k--) {
                            arr[k] = arr[k - 1];
                        }
                        arr[i] = last;
                    }
                }
            }

            System.out.println(new String(arr));
        }
    }
}
