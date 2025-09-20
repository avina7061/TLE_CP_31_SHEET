package TLE_CP_31_SHEET.Contest;

import java.util.Arrays;
import java.util.Scanner;

public class NonDecreasingArray {
    public static int solve(int arr[], int brr[], int i, int status, int dp[][]){
        if(i>=arr.length){
            return 1;
        }
        if(dp[i][status]!=-1)return dp[i][status];
        int prevA =(status==0)?arr[i-1]: brr[i-1];
        int prevB=(status==0)?brr[i-1]: arr[i-1];
        int ans=0;
        if(arr[i]>=prevA&&brr[i]>=prevB){//not swap
            ans=(ans+solve(arr,brr,i+1,0,dp))%998244353;
        }
        if(brr[i]>=prevA&&arr[i]>=prevB){//swap
            ans=(ans+solve(arr,brr,i+1,1,dp))%998244353;
        }
        return dp[i][status]=ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            int dp[][]= new int[n+1][2];
            int arr[] = new int[n];
            int brr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0; i<n; i++){
                brr[i]=sc.nextInt();
            }
            int ans =0;
            for(int i[]: dp){
                Arrays.fill(i,-1);
            }
            ans=( ans+solve(arr,brr,1,0,dp))%998244353;
            ans= (ans+solve(arr,brr,1,1,dp))%998244353;
            System.out.println(ans);
        }
    }
}
