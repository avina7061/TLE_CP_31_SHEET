package TLE_CP_31_SHEET.CP.EXTRA_SET;

import java.util.HashSet;
import java.util.Scanner;

public class MINMAXMEX1500 {
    public static boolean solve(long mex,long arr[],int k){
           int cnt=0;
        HashSet<Long>set = new HashSet<>();
           for(int i=0; i<arr.length; i++){
               if(arr[i]<mex){
                   set.add(arr[i]);
               }
               if(set.size()==mex){
                   cnt++;
                   set.clear();
               }
           }
           return cnt>=k;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k =sc.nextInt();
            long arr[] = new long[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextLong();
            }
            long left=0;
            long right=n/k;
            long ans=0;
            while(left<=right){
                long mid=(left+right)/2;
                if(solve(mid,arr,k)){
                    ans=mid;
                    left=mid+1;
                }
                else{
                    right = mid-1;
                }
            }
            System.out.println(ans);
        }
    }
}
