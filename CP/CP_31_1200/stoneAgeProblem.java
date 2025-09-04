package TLE_CP_31_SHEET.CP.CP_31_1200;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class stoneAgeProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        long[] arr = new long[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
            sum += arr[i];
        }

        long allVal = -1;
        HashSet<Integer> customIndices = new HashSet<>();
        ArrayList<Long> ans = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            int type = sc.nextInt();

            if (type == 1) {
                int ind = sc.nextInt() - 1;
                long val = sc.nextLong();

                if (customIndices.contains(ind)||allVal==-1) {
                    sum += val - arr[ind];
                    arr[ind] = val;
                } else {
                    sum += val - allVal;
                    arr[ind] = val;
                    customIndices.add(ind);
                }

                ans.add(sum);
            } else {
                long val = sc.nextLong();
                allVal = val;
                customIndices.clear();
                sum = val * n;
                ans.add(sum);
            }
        }

        for (long x : ans) {
            System.out.println(x);
        }

    }
}
