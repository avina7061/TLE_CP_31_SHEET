package TLE_CP_31_SHEET.CP.CP_31_1300;

import java.util.Scanner;

public class SumDecomposition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            long n =sc.nextLong();
            long x=sc.nextLong();
            if(x==0&&n==1){
                System.out.println(-1);
                continue;
            }
            if(x==0&&n%2==0){
                System.out.println(n);
                continue;
            }
            else if(x==0&&n%2!=0){
                System.out.println(n-2+5);
                continue;
            }

            int val =Long.bitCount(x);
            if(val>=n){
                System.out.println(x);
                continue;
            }
            if(x==1){
                if(n%2!=0){
                    System.out.println(n);
                }
                else System.out.println((n-2)+5);
                continue;
            }

            if(n%2==0&&val==1){
                if(x%2==0){
                    System.out.println(n+x);
                }
                else{
                    System.out.println((n-2)+x);
                }
                continue;
            }
            if(n%2==0&&val%2==0){
                System.out.println(x+(n-val));
            }
            else if(n%2==0&&val%2!=0){
                System.out.println(x+(n-(val-1)));
            }
            else if(n%2!=0&&val%2!=0){
                System.out.println(x+(n-val));
            }
            else if(n%2!=0&&val%2==0){
                System.out.println(x+(n-(val-1)));
            }
            else{
                System.out.println(-1);
            }


        }
    }
}