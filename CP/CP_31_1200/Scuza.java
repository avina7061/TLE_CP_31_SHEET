package TLE_CP_31_SHEET.CP.CP_31_1200;

import java.util.Scanner;

public class Scuza {
    public static int getInd(long[] arr, long x) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= x) low = mid + 1;
            else high = mid;
        }
        return low;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            long[] arr = new long[n];
            long[] qrr = new long[q];
            long[] maxStep = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            maxStep[0]=arr[0];
            long[] pre = new long[n];
            pre[0] = arr[0];
            for (int i = 1; i < n; i++) {
                pre[i] = pre[i - 1] + arr[i];
                maxStep[i]=Math.max(maxStep[i-1],arr[i]);
            }

            for (int i = 0; i < q; i++) qrr[i] = sc.nextLong();

            long ans[] = new long[q];
            for(int i=0; i<q; i++){
                int get = getInd(maxStep,qrr[i]);
                ans[i]=(get==0)?0:pre[get-1];
            }
            for (int i = 0; i < q; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
