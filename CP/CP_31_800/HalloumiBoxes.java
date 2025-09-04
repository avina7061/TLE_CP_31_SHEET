package TLE_CP_31_SHEET.CP.CP_31_800;

import java.util.Arrays;
import java.util.Scanner;

public class HalloumiBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            if (k == 1) {
                int temp[] = Arrays.copyOf(arr, n);
                Arrays.sort(temp);
                if (Arrays.equals(temp, arr)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("Yes");
            }
        }
    }
}
