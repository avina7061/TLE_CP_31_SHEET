package TLE_CP_31_SHEET.CP.CP_31_1000;

import java.util.Scanner;

public class BlackAndWhiteStripe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            int i=0;
            int j =k;
            int cntW=0;
            int min=Integer.MAX_VALUE;
            for(int a=0; a<j; a++){
                if(s.charAt(a)=='W'){
                    cntW++;
                }
            }
            min=Math.min(min,cntW);
            while(j<n){
                if(s.charAt(j)=='W'){
                    cntW++;
                }
                if(s.charAt(i)=='W'){
                    cntW--;
                }
                min=Math.min(min,cntW);
                i++;
                j++;
            }
            System.out.println(min);
        }
    }
}
