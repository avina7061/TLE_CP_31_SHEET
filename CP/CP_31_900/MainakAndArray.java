package TLE_CP_31_SHEET.CP.CP_31_900;

import java.util.Scanner;

public class MainakAndArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            long min = Long.MAX_VALUE;
            long max = Long.MIN_VALUE;
            int minInd = 0;
            int maxInd = 0;

            for(int i = 0; i < n; i++) {
                if(max < arr[i]) {
                    max = arr[i];
                    maxInd = i;
                }
                if(min > arr[i]) {
                    min = arr[i];
                    minInd = i;
                }
            }

            if(n == 1) {
                System.out.println(0);
                continue;
            }

            if(Math.abs(minInd - maxInd) == 1) {
                System.out.println(max - min);
                continue;
            }

            if(arr[0] < arr[n - 1]) {
                long val=Integer.MIN_VALUE;
                val = Math.max(max-arr[0],arr[0]-min);
                System.out.println(val);
            } else {
               long val = Math.max(max-arr[n-1],arr[n-1]-min);
                System.out.println(val);
            }
        }
    }
}
