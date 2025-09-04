package TLE_CP_31_SHEET.CP.CP_31_1200;

import java.util.Scanner;

public class BinaryDeques {
    static int upperBound(int[] arr, int key) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= key) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    static int lowerBound(int[] arr, int key) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n];
        int[] prefix = new int[n];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        if (sum < s) {
            System.out.println(-1);
            return;
        }

        if (sum == s) {
            System.out.println(0);
            return;
        }

        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int it = upperBound(prefix, s);
        int ans = n - it;

        for (int i = s + 1; i <= sum; i++) {
            int it1 = upperBound(prefix, i);
            int it2 = lowerBound(prefix, i - s);

            int ans1 = n - it1 + it2 + 1;
            ans = Math.min(ans, ans1);
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }
}
