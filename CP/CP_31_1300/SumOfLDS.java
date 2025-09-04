package TLE_CP_31_SHEET.CP.CP_31_1300;

import java.util.Scanner;

public class SumOfLDS {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long p[]= new long[n];
            for(int i=0; i<n; i++){
                p[i]= sc.nextInt();
            }
            long dp[] = new long[n];
            dp[n-1]=1;
            long val = p[n-1];
            long sum=0;
            sum+=dp[n-1];
            for(int i=n-2; i>=0; i--){
                if(p[i]>val){
                    dp[i]=dp[i+1]+1;
                    val=p[i];
                }
                else {
                    dp[i] = dp[i + 1];
                }
                sum+=dp[i];
            }
//            for(int i: dp){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//            System.out.println(sum);
            long ans=0;
            ans+=sum;
            for(int i=n-1; i>0; i--){
                sum--;
                if(dp[i-1]!=dp[i]){
                    sum-=(i);
                }

                ans+=sum;
            }
            System.out.println(ans);
        }
    }
}
