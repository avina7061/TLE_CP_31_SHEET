package TLE_CP_31_SHEET.CP.CP_31_900;

import java.util.Scanner;

public class ABBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
           int countAB=0;
           int countBA=0;
            String s = sc.next();
            for(int i=1; i<s.length(); i++){
                if(s.charAt(i)=='b'&&s.charAt(i-1)=='a'){
                    countAB++;
                }
                if(s.charAt(i)=='a'&&s.charAt(i-1)=='b'){
                    countBA++;
                }
            }
            if(countAB==countBA){
                System.out.println(s);
            }
            else{
                StringBuilder sb = new StringBuilder(s);
                if(s.charAt(0)=='a'){
                    sb.setCharAt(0,'b');
                }
                else{
                    sb.setCharAt(0,'a');
                }
                System.out.println(sb.toString());
            }
        }
    }
}
