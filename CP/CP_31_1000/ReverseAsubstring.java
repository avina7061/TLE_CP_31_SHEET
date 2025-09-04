package TLE_CP_31_SHEET.CP.CP_31_1000;

import java.util.Scanner;

public class ReverseAsubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char ch= s.charAt(0);
        boolean b=true;
        int start=0;
        int end=1;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)<ch){
                end=i;
                System.out.println("YES");
                System.out.println((start+1)+" "+(end+1));
                b=false;
                break;
            }
            if(s.charAt(i)>ch){
                start=i;
                ch=s.charAt(i);
            }
        }
        if(b) System.out.println("NO");
    }
}
