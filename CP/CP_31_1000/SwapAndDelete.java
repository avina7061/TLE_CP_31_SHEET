package TLE_CP_31_SHEET.CP.CP_31_1000;

import java.util.Scanner;

public class SwapAndDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       while(t-->0){
           String s = sc.next();
           int cnt1=0;
           int cnt0=0;
           for(int i=0; i<s.length(); i++){
               if(s.charAt(i)=='1'){
                   cnt1++;
               }
               else{
                   cnt0++;
               }
           }
           int cnt=0;
           if(cnt0==s.length()||cnt1==s.length()){
               System.out.println(s.length());
           }

           else{
                 for(int i=0; i<s.length();i++){
                     if(s.charAt(i)=='0'&&cnt1>0){
                         cnt1--;
                         cnt++;
                     }
                     else if(s.charAt(i)=='1'&&cnt0>0){
                         cnt0--;
                         cnt++;
                     }
                     else{
                         break;
                     }
                 }
               System.out.println(s.length()-cnt);
           }
       }
    }
}
