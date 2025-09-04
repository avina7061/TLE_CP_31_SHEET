package TLE_CP_31_SHEET.CP.CP_31_800;

import java.util.Scanner;

public class EverybodyLikesGoodArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  t = sc.nextInt();
        while(t-->0){


            int n = sc.nextInt();
            long arr[]= new long[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextLong();
            }
            if(n==1){
                System.out.println(0);
                continue;
            }

            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    arr[i] = 0;
                } else {
                    arr[i] = 1;
                }

            }

            int ans = 0;
            int cnt = 1;
            for (int i = 1; i < n; i++) {
                if (arr[i] == arr[i - 1]) {
                    cnt++;
                } else {
                    ans += cnt - 1;
                    cnt = 1;
                }
            }
            ans += cnt - 1;
            System.out.println(ans);

        }
    }


}
