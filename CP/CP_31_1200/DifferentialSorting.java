package TLE_CP_31_SHEET.CP.CP_31_1200;

import java.util.Scanner;

public class DifferentialSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long arr[]= new long[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextLong();
            }
            boolean bool =true;
            for(int i=1; i<n; i++){
                if(arr[i]>=arr[i-1]){
                    continue;
                }
                bool=false;
            }
            if(bool){
                System.out.println(0);
                continue;
            }
            if(arr[n-1]<arr[n-2]||arr[n-1]<0){
                System.out.println(-1);
                continue;
            }
            for(int i=0; i<n-2; i++){
                arr[i]=arr[n-2]-arr[n-1];
            }
            System.out.println(arr.length-2);
            for(int i=0; i<n-2;i++){
                int x=i+1;
                int y=n-1;
                int j=n;
                System.out.println(x+" "+y+" "+j);
            }


        }
    }
}
