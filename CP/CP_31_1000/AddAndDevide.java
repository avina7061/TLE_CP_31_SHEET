package TLE_CP_31_SHEET.CP.CP_31_1000;

import java.util.Scanner;

public class AddAndDevide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while (t-- > 0) {

            long a = sc.nextLong();
            long b = sc.nextLong();

            if(b>a){
                System.out.println(1);
                continue;
            }
            int cnt=0;
int min=Integer.MAX_VALUE;
            for(int i=0; i<=100000; i++){
                long cpya=a;
                cnt=i;
                long cpyb= b+i;
                if(cpyb==1){
                    continue;
                }

                while(cpya!=0){
                    cpya/=cpyb;
                    cnt++;
                }
                min=Math.min(min,cnt);
            }

            System.out.println(min);
        }
    }
}
