package TLE_CP_31_SHEET.CP.CP_31_900;

import java.util.Scanner;

public class BadBoy {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
       while(t-->0){
           long n = sc.nextLong();
           long m = sc.nextLong();
           long i = sc.nextLong();
           long j = sc.nextLong();

           if((i!=1||j!=1)&&(i!=n||j!=m)){
               System.out.println(1+" "+1+" "+n+" "+m);
           }
           else{
               System.out.println(n+" "+1+" "+1+" "+m);
           }
       }
    }
}
