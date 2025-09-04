package TLE_CP_31_SHEET.CP.CP_31_1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DTravelingBufferReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            long[][] arr = new long[n][2];
            for(int i = 0; i < n; i++){
                st = new StringTokenizer(br.readLine());
                arr[i][0] = Long.parseLong(st.nextToken());
                arr[i][1] = Long.parseLong(st.nextToken());
            }

            long minDiff = Math.abs(arr[a-1][0] - arr[b-1][0]) + Math.abs(arr[a-1][1] - arr[b-1][1]);
            long min1 = Long.MAX_VALUE, min2 = Long.MAX_VALUE;
            for(int i = 0; i < k; i++){
                long dist1 = Math.abs(arr[a-1][0] - arr[i][0]) + Math.abs(arr[a-1][1] - arr[i][1]);
                long dist2 = Math.abs(arr[b-1][0] - arr[i][0]) + Math.abs(arr[b-1][1] - arr[i][1]);
                min1 = Math.min(min1, dist1);
                min2 = Math.min(min2, dist2);
            }

            long teleportCost = (min1 == Long.MAX_VALUE || min2 == Long.MAX_VALUE) ? Long.MAX_VALUE : min1 + min2;
            System.out.println(Math.min(minDiff, teleportCost));
        }
    }
}
