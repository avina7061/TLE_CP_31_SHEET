package CP;

import java.util.Scanner;

public class UltimateValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            if (arr.length == 1) {
                System.out.println(arr[0]);
                continue;
            }
            int left = -1;
            int right = -1;
            long cost = 0;
            if (n % 2 != 0) {
                left = 0;
                right = n - 1;
                cost = (right - left);
            } else if (n != 2) {
                left = 1;
                right = n - 1;
                cost = (right - left);
            }
            int l = 0;
            int r = 0;
            long min = Long.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (min > 2 * arr[i] + i && i % 2 == 0) {
                    l = i;
                    min = 2 * arr[i] + i;
                }
                if (2 * arr[i] + i > min && i % 2 != 0) {
                    r = i;
                }
                if (2 * arr[i] + i - min > cost && i % 2 != 0) {
                    left = l;
                    right = r;
                    cost = Math.max(2 * arr[i] + i - min, cost);
                }
            }
            long max = Long.MIN_VALUE;
            for (int i = 1; i < n; i++) {
                if (2 * arr[i] - i > max && i % 2 != 0) {
                    max = 2 * arr[i] - i;
                    l = i;
                }
                if (max > 2 * arr[i] - i && i % 2 == 0) {
                    r = i;
                }
                if (max - (2 * arr[i] - i) > cost && i % 2 == 0) {
                    cost = max - (2 * arr[i] - i);
                    left = l;
                    right = r;
                }
            }
            if (left == -1 && right == -1) {
                long sum = 0;
                for (int i = 0; i < n; i++) {
                    if (i % 2 == 0) {
                        sum += arr[i];
                    } else {
                        sum += (-arr[i]);
                    }
                }
                System.out.println(sum);
            } else if (arr[left] > 0 && arr[right] > 0 || arr[left] < 0 && arr[right] < 0) {
                long sum = 0;
                for (int i = 0; i < n; i++) {
                    if (i % 2 == 0) {
                        sum += arr[i];
                    } else {
                        sum += (-arr[i]);
                    }
                }
                System.out.println(sum + cost);
            } else {
                long sum = 0;
                for (int i = 0; i < n; i++) {
                    if (left == i || right == i) {
                        arr[i] = -arr[i];
                    }
                    if (i % 2 == 0) {
                        sum += arr[i];
                    } else {
                        sum += (-arr[i]);
                    }
                }
                System.out.println(sum + (right - left));
            }
        }
    }
}
