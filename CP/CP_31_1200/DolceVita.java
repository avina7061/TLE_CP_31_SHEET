package TLE_CP_31_SHEET.CP.CP_31_1200;

import java.util.Arrays;
import java.util.Scanner;

public class DolceVita {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long x = sc.nextLong();
            long arr[] = new long[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            long pre[] = new long[n];
            Arrays.sort(arr);

            pre[0] = arr[0];
            for (int i = 1; i < n; i++) {
                pre[i] = pre[i - 1] + arr[i];
            }

            int val = 0;
            long ans = 0;

          for(int i=0; i<n; i++){
              if(x-pre[i]>=0){
                  ans+=(x-pre[i])/(i+1)+1;
              }
          }

            System.out.println(ans);
        }
    }
}
