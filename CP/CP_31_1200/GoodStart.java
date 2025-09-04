package TLE_CP_31_SHEET.CP.CP_31_1200;

import java.util.Scanner;

public class GoodStart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            long w= sc.nextLong();
            long h= sc.nextLong();
            long a= sc.nextLong();
            long b= sc.nextLong();

            long x1= sc.nextLong();
            long y1= sc.nextLong();
            long x2= sc.nextLong();
            long y2= sc.nextLong();

            long diffX =Math.abs(x1-x2);
            long diffY=Math.abs(y1-y2);

            if(diffX!=0&&diffX%a==0){
                System.out.println("Yes");
                continue;
            }
            if(diffY!=0&&diffY%b==0){
                System.out.println("Yes");
                continue;
            }
            System.out.println("No");
        }
    }
}
