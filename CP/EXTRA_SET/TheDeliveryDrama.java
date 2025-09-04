package TLE_CP_31_SHEET.CP.EXTRA_SET;

import java.util.Arrays;
import java.util.Scanner;

public class TheDeliveryDrama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long a[]= new long[n];
            long b[] = new long[n];
            for(int i=0; i<n;i++){
                a[i]=sc.nextLong();
            }
            for(int i=0; i<n;i++){
                b[i]=sc.nextLong();
            }
            Long dp[][] = new Long[n][2];
            for (int i = 0; i < n; i++) {
                dp[i][0] = a[i];
                dp[i][1] = b[i];
            }

            Arrays.sort(dp, (x, y) -> {
                if (!x[0].equals(y[0])) {
                    return Long.compare(x[0], y[0]);
                } else {
                    return Long.compare(y[1], x[1]);
                }
            });

            long sum=0;
            long ans=dp[n-1][0];
            boolean bool=true;
            if(dp[n-1][0]<=dp[n-1][1]){
                System.out.println(dp[n-1][0]);
                continue;
            }

            for(int i=n-1; i>=0; i--){
                if(sum+dp[i][1]<=dp[i][0]){
                    sum+=dp[i][1];

                }
                else{
                    System.out.println(Math.max(sum,dp[i][0]));
                    bool=false;
                    break;
                }
            }
            if(bool) System.out.println(sum);


        }
    }
}
