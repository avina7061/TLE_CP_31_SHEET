package TLE_CP_31_SHEET.CP.CP_31_800;

import java.util.Scanner;

public class Shashlik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            long k = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();
            long max=0;
            long cnt=0;

           if(k>=a){
               long val =k-a;
               cnt++;
               long rest =a-x;
               cnt+=val/x;
               long v =val%x;
               rest+=v;

               if(rest>=b){
                   rest-=b;
                   cnt+=rest/y;
                   cnt++;
               }
               max=Math.max(cnt,max);
           }
            cnt=0;
           if(k>=b){
               long val =k-b;
               cnt++;
               long rest =b-y;
               cnt+=val/y;
               long v =val%y;
               rest+=v;
               if(rest>=a){
                   rest-=a;
                   cnt+=rest/x;
                   cnt++;
               }


               max=Math.max(cnt,max);
           }
            System.out.println(max);
        }
    }
}
