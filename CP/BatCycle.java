package TLE_CP_31_SHEET.CP;

import java.util.Scanner;

public class BatCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n =sc.nextLong();
            long k=sc.nextLong();
            if(n%2==0){
                if(k%n==0){
                    System.out.println(n);
                }
                else{
                    System.out.println(k%n);
                }
            }
            else{
                    long total=k/n;
                    long rem=(k%n==0?n:k%n);
                    if((total-1)%n<=rem){
                        System.out.println((k+total+1)%n);
                    }
                    else{
                        System.out.println((k+total)%n);
                    }

            }
        }
    }
}
