package TLE_CP_31_SHEET.CP.CP_31_1300;

import java.util.Arrays;
import java.util.Scanner;

public class coloringPairs {
    public static long CalcSum(long[]arr,long val){
        int i=0; int j=arr.length-1;
        long cnt=0;
        while(i<j){
            if(arr[i]+arr[j]<val){
                cnt+=(j-i);
                i++;
            }
            else j--;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long x= sc.nextLong();
            long y= sc.nextLong();
            long arr[] = new long[n];
            long sum=0;
            for(int i=0; i<n; i++){
                arr[i]= sc.nextLong();
                sum+=arr[i];
            }
            Arrays.sort(arr);
            long val1=sum-x+1;
            long val2=sum-y;
            long ans1=CalcSum(arr,val1);

            long ans2=CalcSum(arr,val2);
//            System.out.println("ans2"+ans2);
            System.out.println(Math.abs(ans2-ans1));

        }
    }
}
