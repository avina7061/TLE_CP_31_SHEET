package TLE_CP_31_SHEET.CP.CP_31_1000;

import java.util.Scanner;

public class FairNumbers {
    public static boolean check (long a){
        long x=a;
        while(x>0){
            long div=x%10;
            if(div!=0&&a%div!=0){
                return false;
            }
            x/=10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            while(!check(n)){
                n++;
            }
            System.out.println(n);
        }
    }
}
