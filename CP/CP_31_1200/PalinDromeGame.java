package TLE_CP_31_SHEET.CP.CP_31_1200;

import java.util.Scanner;

public class PalinDromeGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int cnt=0;
            for(int i=0; i<n; i++){
                if(s.charAt(i)=='0'){
                    cnt++;
                }
            }
            int alice=0;
            int bob=0;
            if(cnt==0){
                System.out.println("DRAW");
                continue;
            }
            if(cnt%2==0||cnt==1){
                System.out.println("BOB");
            }
            else {
                System.out.println("ALICE");
            }
        }
    }
}
