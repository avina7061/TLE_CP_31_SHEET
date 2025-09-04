package TLE_CP_31_SHEET.CP.CP_31_1300;

import java.util.Scanner;

public class ChatBan {
    public static long findMaxK(long x, long target) {
        long low = 1, high = x;
        long result = 0;

        while (low <= high) {
            long k = (low + high) / 2;
            long sum = (long) k * (2L * x - k + 1) / 2;

            if (sum <= target) {
                result = k;
                low = k + 1;
            } else {
                high = k - 1;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long k= sc.nextLong();
            long x=sc.nextLong();
            long val=k*(k+1)/2;
            long nt =(long)(-1+Math.sqrt(1+8*x))/2;
//            System.out.println(nt);
            if(val>=x){
                long y=nt*(nt+1)/2;
                if(y>=x){
                    System.out.println(nt);
                }
                else{
                    System.out.println(nt+1);
                }
            }
            else{
                long rem=x-val;
//                System.out.println(rem);
                long a= findMaxK(k-1,rem);
//                System.out.println(a);
                long v=(k-1);
                long sum=  a * (2 * v - a + 1) / 2;
//              System.out.println(sum);
                if(sum>=rem||a>=(k-1)||k==1){
                    System.out.println(k+a);
                }
                else{
                    System.out.println(k+a+1);
                }

            }
        }
    }
}
