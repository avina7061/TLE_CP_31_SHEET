package TLE_CP_31_SHEET.CP.CP_31_900;

import java.util.Scanner;

public class DinnerTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int p = sc.nextInt();
            int q = sc.nextInt();

            if(n%p==0&&(n/p)*q!=m){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        }
    }
}
