package TLE_CP_31_SHEET.CP.CP_31_1300;

import java.util.Scanner;

public class MoveAndTurn2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
//by analysis of dp that follow normal AP
        if(n%2==0){
            int x = n/2;
            System.out.println((int)(x+1)*(x+1));
        }
        else{
            int x = n/2+1;
            System.out.println(2*x*(x+1));
        }
    }
}
