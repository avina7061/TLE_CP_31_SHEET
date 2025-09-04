package TLE_CP_31_SHEET.CP.CP_31_900;

import java.util.Scanner;

public class ExcitingBets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long max=0;
            if(a==b){
                System.out.println(0+" "+0);
                continue;
            }
            long min=Long.MAX_VALUE;
            max=Math.abs(b-a);
            if(a>b){
                min=Math.min(min,max-(a%max));
                min=Math.min(min,a%max);
            }
            else{
                min =Math.min(max-(b%max),min);
                min=Math.min(min,b%max);
            }
            System.out.println(max+" "+min);
        }
    }
}
