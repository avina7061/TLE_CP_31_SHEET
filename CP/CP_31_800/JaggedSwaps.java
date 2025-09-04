package TLE_CP_31_SHEET.CP.CP_31_800;

import java.util.Scanner;

public class JaggedSwaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int arr[]= new int[n];
            int min = Integer.MAX_VALUE;
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
                min=Math.min(min,arr[i]);
            }
            if(arr[0]==min) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
