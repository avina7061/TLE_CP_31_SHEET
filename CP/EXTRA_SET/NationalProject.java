package TLE_CP_31_SHEET.CP.EXTRA_SET;

import java.util.Scanner;

public class NationalProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
       while(t-->0){
            long n =sc.nextLong();
            long g=sc.nextLong();
            long b =sc.nextLong();
            if(g>=n){
                System.out.println(n);
                continue;
            }
            long minPos =(n+1)/2;

                long val=minPos/g;
                if(minPos%g!=0){
                    val++;
                }
                long total=(val-1)*b;

                System.out.println(Math.max(n,minPos+total));


        }
    }
}
