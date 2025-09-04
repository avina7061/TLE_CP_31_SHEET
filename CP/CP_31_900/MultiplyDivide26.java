package TLE_CP_31_SHEET.CP.CP_31_900;

import java.util.Scanner;

public class MultiplyDivide26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            int cnt=0;
            boolean b =true;
            while(n!=1){
                if(n%6==0){
                    n/=6;
                    cnt++;
                }
                else if((n*2)%6==0){
                    n*=2;
                    n/=6;
                    cnt+=2;
                }
                else{
                    b=false;
                    System.out.println("-1");
                    break;
                }
            }
            if(b) System.out.println(cnt);
        }
    }
}
