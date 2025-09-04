package TLE_CP_31_SHEET.CP.CP_31_800;

import java.util.Scanner;
public class abc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();

        while(t-->0){
            int x= sc.nextInt();
            int y = sc.nextInt();
            boolean b =true;
            while(x>=0){
                if(x+1==y){
                    System.out.println("Yes");
                    b=false;
                    break;
                }
                x-=9;
                if(x+1==y){
                    System.out.println("Yes");
                    b=false;
                    break;
                }
            }
            if(b) System.out.println("No");
        }

    }
}