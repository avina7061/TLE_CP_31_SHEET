package TLE_CP_31_SHEET.CP.CP_31_800;

import java.util.Scanner;

public class LineTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();

        while(t-->0){
            int n =sc.nextInt();
            int x = sc.nextInt();
            int min=Integer.MIN_VALUE;
            int arr[]= new int[n];

            for(int i=0;i<n; i++){
                arr[i]= sc.nextInt();
            }
            min= Math.max(min,arr[0]-0);
            for(int i=1; i<n; i++){
                min= Math.max(min,arr[i]-arr[i-1]);
            }
            min = Math.max(min,(x-arr[n-1])*2);
            System.out.println(min);
        }
    }
}
