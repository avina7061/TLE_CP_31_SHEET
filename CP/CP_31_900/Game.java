package TLE_CP_31_SHEET.CP.CP_31_900;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int cnt0=0;
            int cnt1=0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='0'){
                    cnt0++;
                }
                else{
                    cnt1++;
                }
            }
            int min =Integer.MAX_VALUE;
            min=Math.min(cnt0,cnt1);

            if(min%2==0){
                System.out.println("NET");
            }
            else{
                System.out.println("DA");
            }
        }
    }
}
