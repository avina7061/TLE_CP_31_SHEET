package TLE_CP_31_SHEET.CP.CP_31_900;

import java.util.Scanner;

public class Mainak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[]=new int[n];
            for(int i=0; i<n; i++){
                arr[i]= sc.nextInt();
            }
            //total three possibility
            int max = Integer.MIN_VALUE;
            for(int i=1; i<n; i++){
                max=Math.max((arr[i]-arr[0]),max);
            }

            for(int i=0; i<n-1; i++){
                max=Math.max((arr[n-1]-arr[i]),max);
            }

            for(int i=n-1; i>0; i--){
                max=Math.max(max,(arr[i-1]-arr[i]));
            }
            System.out.println((max==Integer.MIN_VALUE)? 0: max);
        }
    }
}
