package TLE_CP_31_SHEET.CP.CP_31_1100;

import java.util.Scanner;

public class ThousandTonsOfTNT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long arr[]= new long[n];
            for(int i=0; i<n; i++){
                arr[i]= sc.nextInt();
            }
            long preSum[]= new long[n];
            preSum[0]=arr[0];
            for(int i=1; i<n; i++){
                preSum[i]=preSum[i-1]+arr[i];
            }
            Long max=Long.MIN_VALUE;

            for(int i=1; i<=n; i++){
                Long maxVal=Long.MIN_VALUE;
                Long minVal=Long.MAX_VALUE;
                if(n%i==0){
                    long pre=0;
                    int j=i;
                   while(j<=n){
                       long val=preSum[j-1]-pre;
                      maxVal=Math.max(maxVal,val);
                      minVal=Math.min(minVal,val);
                       pre=preSum[j-1];
                       j+=i;
                   }
                   max=Math.max(max,(maxVal-minVal));
                }
            }
            System.out.println(max);

        }
    }
}
