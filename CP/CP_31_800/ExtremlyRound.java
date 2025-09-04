package TLE_CP_31_SHEET.CP.CP_31_800;

import java.util.Scanner;

public class ExtremlyRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int sum=0;
            if(n<10){
                System.out.println(n);
            }
            else{
                if(n<=100){
                    sum=9+(n/10);
                }
                else if(n<=1000){
                    sum=9+9+n/100;
                }
                else if(n<=10000){
                    sum=9+9+9+n/1000;
                }
                else if(n<=100000){
                    sum=9+9+9+9+n/10000;
                }
                else{
                    sum=9+9+9+9+9+n/100000;
                }
                System.out.println(sum);
            }
        }
    }
}
