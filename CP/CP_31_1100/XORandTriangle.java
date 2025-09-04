package TLE_CP_31_SHEET.CP.CP_31_1100;

import java.util.Scanner;

public class XORandTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long temp=n;
            int cnt=0;
            while(temp>0){
                temp=temp>>1;
                cnt++;
            }
            if(cnt==Long.bitCount(n)||Long.bitCount(n)==1){
                System.out.println(-1);
            }
            else{
                if(n%2!=0){
                    System.out.println(n^(n+1));
                }
                else{
                    System.out.println(n-1);
                }
            }
        }
    }
}
