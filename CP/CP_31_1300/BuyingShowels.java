package TLE_CP_31_SHEET.CP.CP_31_1300;

import java.util.Scanner;

public class BuyingShowels {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n =sc.nextLong();
            long k = sc.nextLong();
            long ans=n;
            boolean bmw=true;
            for(int i = 1; (long) i *i<=n; i++){
                if(n%i==0){
                    long val =n/i;
                    if(val<=k){
                        System.out.println(n/val);
                        bmw=false;
                        break;
                    }
                    if(i<=k){
                        ans=Math.min(ans,val);
                    }
                }
            }
            if(bmw){
                System.out.println(ans);
            }
        }
    }
}
