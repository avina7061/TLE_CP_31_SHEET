package TLE_CP_31_SHEET.CP.CP_31_1300;

import java.util.ArrayList;
import java.util.Scanner;

public class MakeItUlterNative {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
       while(t-->0){
           String s=sc.next();
           ArrayList<Long>list = new ArrayList<>();
           long cnt=1;
           for(int i=1; i<s.length(); i++){
               if(s.charAt(i)==s.charAt(i-1)){
                   cnt++;
               }
               else{
                   list.add(cnt);
                   cnt=1;
               }
           }
           list.add(cnt);
           long fact = 1;
           long val=0;
           for(long i: list){
               val+=(i-1);
               fact=(fact*i)%998244353;
           }
           for (long j = 2; j <= val; j++) {
               fact= (fact*j)%998244353;
           }
           System.out.println(val+" "+fact);
       }
    }
}
