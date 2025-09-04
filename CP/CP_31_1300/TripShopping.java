package TLE_CP_31_SHEET.CP.CP_31_1300;

import java.util.Arrays;
import java.util.Scanner;

public class TripShopping {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k =sc.nextInt();
            long ans=0;
            long arr[] = new long[n];
            long brr[] = new long[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextLong();
            }
            for(int j=0; j<n; j++){
                brr[j]=sc.nextLong();
            }
            long dp[][] = new long[n][2];
            for(int i=0; i<n; i++){
                ans+=Math.abs(arr[i]-brr[i]);

                dp[i][0]=Math.min(arr[i],brr[i]);
                dp[i][1]=Math.max(arr[i],brr[i]);
            }

            Arrays.sort(dp, (a, b) -> Long.compare(a[0], b[0]));
//            for(long i[]:dp){
//                System.out.println(i[0]+" "+i[1]);
//            }
            boolean intersect =false;
            for(int i=1; i<n; i++){

                if(dp[i][0]<=dp[i-1][1]){
                    intersect=true;
                    break;
                }
            }
            if(intersect){
                System.out.println(ans);
            }
            else{
                long val=Long.MAX_VALUE;
                for(int i=1; i>0; i++){
                    val=Math.min(val,2*(dp[i][0]-dp[i-1][1]));
                }
//                System.out.println(val);
//                System.out.println(ans);
                System.out.println(val+ans);
            }
        }

    }
}
