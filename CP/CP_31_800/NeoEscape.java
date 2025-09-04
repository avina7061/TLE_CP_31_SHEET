package TLE_CP_31_SHEET.CP.CP_31_800;

import java.util.Arrays;
import java.util.Scanner;

public class NeoEscape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int arrCopy[] = Arrays.copyOf(arr, n);
            Arrays.sort(arrCopy);
            int ind = n - 1;
            int ansCnt = 0;
            boolean visited[] = new boolean[n];

            while (ind >= 0) {
                boolean pressed = false;

                for (int j = 0; j < n; j++) {
                    if (arr[j] == arrCopy[ind] && !visited[j]) {
                        boolean left = j > 0 && visited[j - 1];
                        boolean right = j < n - 1 && visited[j + 1];

                        if (!left && !right) {
                            boolean skip = false;
                            for (int k = j + 1; k < n; k++) {
                                if (arr[k] == arr[j] && !visited[k]) {
                                    skip = true;
                                    break;
                                }
                            }
                            if (skip) continue;
                        }

                        if (!left && !right) {
                            ansCnt++;
                        }
                        visited[j] = true;
                        pressed = true;
                        break;
                    }
                }

                ind--;
            }

            System.out.println(ansCnt);
        }
    }
}
