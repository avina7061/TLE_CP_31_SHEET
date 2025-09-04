package TLE_CP_31_SHEET.CP.CP_31_800;

import java.util.Arrays;
import java.util.Scanner;
public class ServalAndMochaArray {
    public static int GCD(int a, int b){
        while(a != 0){
            int temp = a;
            a = b % a;
            b = temp;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[]= new int[n];
            for(int i=0; i<n; i++){
                arr[i]= sc.nextInt();
            }
            int ans=1;
            boolean b = true;
            Arrays.sort(arr);
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if(GCD(arr[i],arr[j])<=2){
                        System.out.println("Yes");
                        b= false;
                        break;
                    }
                }
                if(!b)break;
            }
           if(b){
               System.out.println("No");
           }

        }
    }
}
