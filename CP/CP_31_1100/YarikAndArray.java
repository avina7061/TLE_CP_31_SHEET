package TLE_CP_31_SHEET.CP.CP_31_1100;

import java.util.Scanner;

public class YarikAndArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[]= new int[n];
            for(int i=0; i<n; i++){
                arr[i]= sc.nextInt();
            }
            long sum=0;long max=Long.MIN_VALUE;
            for(int i=0; i<n; i++){
                sum+=arr[i];
                if(arr[i]>sum){
                    sum=arr[i];
                }
                max=Math.max(max,sum);
                if(i<n-1&&Math.abs(arr[i])%2==Math.abs(arr[i+1])%2){
                    max=Math.max(max,sum);
                    sum=0;
                }


            }
            max=Math.max(max,sum);
            System.out.println(max);
        }
    }
}
