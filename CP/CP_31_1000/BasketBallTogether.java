package TLE_CP_31_SHEET.CP.CP_31_1000;

import java.util.Arrays;
import java.util.Scanner;

public class BasketBallTogether {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


            int n = sc.nextInt();
            long d = sc.nextLong();
            long arr[] = new long[n];
            for(int i=0; i<n; i++){
                arr[i]= sc.nextLong();
            }
            Arrays.sort(arr);
            long cnt = n;
            long ans = 0;
            int ind = n - 1;
            while(cnt > 0){
                if(ind < 0) break;
                long val = arr[ind];
                    if(cnt >= (d / val) + 1){
                        cnt -= ((d / val) + 1);
                        ans++;
                    } else {
                        cnt = 0;
                        break;
                    }
                ind--;
                }


            System.out.println(ans);
        }
    }

