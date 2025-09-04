package TLE_CP_31_SHEET.CP.CP_31_1200;

import java.util.*;

public class StableGroups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long x = sc.nextLong();

        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);

        List<Long> need = new ArrayList<>();
        int cnt = 1;

        for (int i = 1; i < n; i++) {
            long diff = arr[i] - arr[i - 1];
            if (diff > x) {
                long ned = (diff - 1) / x;
                need.add(ned);
                cnt++;
            }
        }

        Collections.sort(need);

        for (long a : need) {
            if (k >= a) {
                k -= a;
                cnt--;
            } else {
                break;
            }
        }

        System.out.println(cnt);
    }
}
