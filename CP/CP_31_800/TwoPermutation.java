package TLE_CP_31_SHEET.CP.CP_31_800;

import java.util.Scanner;

public class TwoPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(n==a&&n==b){
                System.out.println("Yes");
            }
            else if(n==2||n==3){
                System.out.println("No");
            }
            else{
                if(n-(a+b)>=2){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
        }
    }
}
