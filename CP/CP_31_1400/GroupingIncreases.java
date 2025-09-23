package TLE_CP_31_SHEET.CP.CP_31_1400;

import java.util.ArrayList;
import java.util.Scanner;

public class GroupingIncreases {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){

            int n =sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<arr.length; i++){
                arr[i]=sc.nextInt();
            }
           int x=Integer.MAX_VALUE;
            int y=Integer.MAX_VALUE;
            int cnt=0;
            for(int i=0; i<arr.length; i++){
                if(x>y){
                    int temp=x;
                    x=y;
                    y=temp;
                }
                if(arr[i]<=x&&arr[i]<=y){
                    x=arr[i];
                }
                else if(arr[i]>x&&arr[i]<=y){
                    y=arr[i];
                }
                else if(arr[i]>x&&arr[i]>=y){
                    x=arr[i];
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
