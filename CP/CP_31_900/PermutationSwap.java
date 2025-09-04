package TLE_CP_31_SHEET.CP.CP_31_900;

import java.util.Scanner;

public class PermutationSwap {
    public static int GCD(int num1, int num2){
        while(num2 != 0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i]= sc.nextInt();
            }
            int gcd=0;
            for(int i=0; i<n; i++){
                gcd=GCD(gcd,Math.abs(arr[i]-(i+1)));
            }

            System.out.println(gcd);
        }
    }
}
