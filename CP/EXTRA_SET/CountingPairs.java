package TLE_CP_31_SHEET.CP.EXTRA_SET;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class CountingPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            long x[] = new long[n];
            long r[] = new long[n];
            for(int i=0; i<n; i++){
                x[i]=sc.nextLong();
            }
            for(int i=0; i<n; i++){
                r[i]=sc.nextLong();
            }
            long dp[][] = new long[n][2];
            for(int i=0; i<n; i++){
                dp[i][0]=x[i];
                dp[i][1]=r[i];
            }
            Arrays.sort(dp, (a, b) -> {
                long diffA = a[0] - a[1];
                long diffB = b[0] - b[1];

                if (diffA != diffB) {
                    return Long.compare(diffA, diffB);
                } else {
                    return Long.compare(a[0], b[0]);
                }
            });
            long ans=0;
          HashMap<Long,Long> map = new HashMap<>();
          for(int i=0;i<n; i++){
              long left=dp[i][0]-dp[i][1];
              long right =dp[i][0]+dp[i][1];
              while(left<=right){
                  long y = (long)Math.sqrt(dp[i][1]*dp[i][1]-(left-dp[i][0])*(left-dp[i][0]));
                  map.put(left,Math.max(map.getOrDefault(left, 0L),2*y+1));
                  left++;
              }
          }
          for(long mp: map.keySet()){
              ans+=map.get(mp);
          }

            System.out.println(ans);

        }
    }
}
