package TLE_CP_31_SHEET.CP.CP_31_800;

import java.util.Scanner;

public class GrassHopper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int k = sc.nextInt();
            int total=x;
            if(x<k||x%k!=0){
                System.out.println(1);
                System.out.println(x);
            }
            else{
                while(x%k==0){
                    x--;
                }
                System.out.println(2);
                System.out.println(x+" "+ (total-x));
            }
        }
    }
}
