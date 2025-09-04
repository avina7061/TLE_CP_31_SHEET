package TLE_CP_31_SHEET.CP.CP_31_800;

import java.util.Scanner;

public class Energy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            long x=sc.nextLong();
            int cnt=0;
            while(x>=1){
                x/=2;
                cnt++;
            }
            System.out.println(cnt*2+1);
        }
    }
}
