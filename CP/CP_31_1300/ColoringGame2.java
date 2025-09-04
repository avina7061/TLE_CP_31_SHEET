package TLE_CP_31_SHEET.CP.CP_31_1300;

import java.util.Scanner;

public class ColoringGame2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i]= sc.nextInt();
            }
            long sum=0;
            for(int k=2; k<n; k++){
                int i=0;
                int j=k-1;
                while(i<j){
                    if(arr[i]+arr[j]>arr[k]&&arr[i]+arr[j]>arr[n-1]-arr[k]){
                        sum+=j-i;
                        j--;
                    }
                    else i++;
                }

            }
            System.out.println(sum);
        }
    }
}
