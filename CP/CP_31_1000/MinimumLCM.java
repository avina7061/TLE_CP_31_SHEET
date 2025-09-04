package TLE_CP_31_SHEET.CP.CP_31_1000;

import java.util.Scanner;

public class MinimumLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();

            if(n % 2 == 0){
                System.out.println(n / 2 + " " + n / 2);
            } else {
                long d = 1;
                for(long i = 2; i * i <= n; i++){
                    if(n % i == 0){
                        d = i;
                        break;
                    }
                }
                if(d == 1){
                    System.out.println(1 + " " + (n - 1));
                } else {
                    long a = n - n / d;
                    long b = n / d;
                    System.out.println(b + " " + a);
                }
            }
        }
    }
}
