package TLE_CP_31_SHEET.CP.CP_31_1200;

import java.util.Scanner;

public class PlusMinusPermutation {
    static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long x= sc.nextLong();
            long y = sc.nextLong();
            long val1=n/x;
            long val2=n/y;
            long lcm = lcm(x,y);
            long min= n/lcm;
            val1-=min;
            val2-=min;
            long xr=n-val1;
            long sum1=(n*(n+1)/2)-(xr*(xr+1)/2);
            long sum2=val2*(val2+1)/2;
            System.out.println(sum1-sum2);
        }

    }
}
