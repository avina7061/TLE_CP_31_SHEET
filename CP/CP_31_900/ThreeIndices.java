package TLE_CP_31_SHEET.CP.CP_31_900;

import java.util.Scanner;

public class ThreeIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i]= sc.nextInt();
            }
            int a =0;
            int b = 0;
            int c=0;
            boolean d =true;
            for(int i=1; i<n; i++){
                if(b!=0&&arr[b]>arr[i]){
                    c=i;
                    System.out.println("Yes");
                    System.out.println((a+1)+" "+(b+1)+" "+(c+1));
                    d= false;
                    break;
                }
                if(arr[a]>arr[i]){
                    a=i;
                }
                else if(arr[a]<arr[i]){
                    b=i;
                }

            }
            if(d){
                System.out.println("No");
            }
        }
    }
}
