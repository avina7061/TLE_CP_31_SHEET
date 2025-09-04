package TLE_CP_31_SHEET.CP.CP_31_1300;

import java.util.Scanner;

public class Shuffle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long x=sc.nextLong();
            int m = sc.nextInt();
            boolean a= false;
            long left=0;
            long right=0;
            while(m-->0){
                long l= sc.nextLong();
                long r = sc.nextLong();

               if(l<=x&&r>=x&&!a){
                   left=l;
                   right=r;
                   a=true;
               }
               if(a){
                   if(l<=left&&r>=left||l<=right&&r>=right||left<=l&&right>=l||left<=r&&right>=r){
                       left=Math.min(left,l);
                       right=Math.max(right,r);
                   }
               }
            }
            System.out.println(right-left+1);
        }
    }
}
