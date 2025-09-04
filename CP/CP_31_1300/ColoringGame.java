package TLE_CP_31_SHEET.CP.CP_31_1300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ColoringGame {
    public static int lowerBound(ArrayList<Integer> list, int from, int to, int key) {
        int low = from, high = to;
        while (low < high) {
            int mid = (low + high) / 2;
            if (list.get(mid) < key)
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }

    public static int upperBound(ArrayList<Integer> list, int from, int to, int key) {
        int low = from, high = to;
        while (low < high) {
            int mid = (low + high) / 2;
            if (list.get(mid) <= key)
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            ArrayList<Integer> list = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                list.add(Integer.parseInt(st.nextToken()));
            }

            long sum = 0;
            for (int i = 0; i < n - 2; i++) {
                for (int j = i + 1; j < n - 1; j++) {
                    int lb = lowerBound(list, j + 1, n, list.get(i) + list.get(j));
                    if (lb == j + 1 && list.get(j + 1).equals(list.get(j))) {
                        continue;
                    }
                    int val = list.get(n - 1) - (list.get(i) + list.get(j));
                    int ub = upperBound(list, j + 1, n, val);
                    if (lb >= ub) {
                        sum += lb - ub;
                    }
                }
            }
            System.out.println(sum);
        }
    }
}
