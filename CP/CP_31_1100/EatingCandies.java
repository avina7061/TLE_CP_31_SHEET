package TLE_CP_31_SHEET.CP.CP_31_1100;

import java.util.Scanner;

public class EatingCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i]= sc.nextInt();
            }
            int left=0;
            int right=n-1;
            int leftSum=0;
            int rightSum=0;
            int i=0;
            int j=n-1;
            int cnt=0;
            while(i<=j){
                if(leftSum<rightSum){
                    leftSum+=arr[i];
                    i++;
                }
                else if(rightSum<leftSum){
                    rightSum+=arr[j];
                    j--;
                }
                else{
                    leftSum+=arr[i];
                    rightSum+=arr[j];
                    cnt+=i-left;
                    cnt+=right-j;
                    left=i;
                    right=j;
                    i++;
                    j--;
                }

            }
            if(Math.abs(i-j)==1&&leftSum==rightSum){
                cnt+=i-left;
                cnt+=right-j;
            }
            System.out.println(cnt);
        }
    }
}
