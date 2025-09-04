package TLE_CP_31_SHEET.CP.CP_31_1000;

import java.util.Scanner;

public class NumberBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[][]= new int[n][m];
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    arr[i][j]= sc.nextInt();
                }
            }
             int evenVal=0;
            long sum=0;
            int min= Integer.MAX_VALUE;
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    min=Math.min(min,Math.abs(arr[i][j]));
                    if(arr[i][j]<0){
                        evenVal++;
                    }
                    sum+=Math.abs(arr[i][j]);
                }
            }
            if(evenVal%2==0){
                System.out.println(sum);
            }
            else{
                System.out.println(sum-(2*min));
            }

        }
    }
}
