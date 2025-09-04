package TLE_CP_31_SHEET.CP.CP_31_1300;

import java.util.Scanner;

public class StayOrMirror {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int[] preCntL = new int[n];
            for (int i = 0; i < n; i++) {
                int count = 0;
                for (int j = 0; j < i; j++) {
                    if (arr[j] > arr[i]) {
                        count++;
                    }
                }
                preCntL[i] = count;
//                System.out.println(count);
            }
//            System.out.println("break");
            int[] preCntR = new int[n];
            for (int i = n-1; i >=0; i--) {
                int count = 0;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[i]) {
                        count++;
                    }
                }
                preCntR[i] = count;
//                System.out.println(count);
            }
//            System.out.println("break");
            int val=0;
            int ansCnt = 0;
            for (int i = 0; i < n; i++) {
                int left = preCntL[i];
                int right = preCntR[i];

                if (left + right > n - (i + 1)) {
                    ansCnt += n - (i + 1);
                    System.out.println(ansCnt+" 1");
                    val++;
                } else {
                    ansCnt += (left + right);
                    System.out.println("left "+left+" right "+right);
                    System.out.println(ansCnt+" 2");
                }

            }

            System.out.println(ansCnt);
        }
    }
}
