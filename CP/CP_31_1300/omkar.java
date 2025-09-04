package TLE_CP_31_SHEET.CP.CP_31_1300;

import java.util.Scanner;

public class omkar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n =sc.nextInt();
            boolean b =true;
            for(int i=2; i*i<=n; i++){
                if(n%i==0){
                    System.out.println(n/i+" "+(n-n/i));
                    b=false;
                    break;
                }
            }
           if(b) System.out.println(1+" "+(n-1));
        }
    }
}
