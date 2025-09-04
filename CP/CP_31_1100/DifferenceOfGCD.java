package TLE_CP_31_SHEET.CP.CP_31_1100;

import java.util.Scanner;

public class DifferenceOfGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long l= sc.nextLong();
            long r =sc.nextLong();
            long arr[]= new long[n];
            int cnt=0;
            boolean bc=true;
            for(int i=1; i<=n; i++){
                if(l%i==0){
                    arr[cnt]=l;
                    cnt++;
                }
                else{
                    long val=l/i;
                    long vt=i*val+i;
                    if(vt<=r&&vt>=l){
                        arr[cnt]=vt;
                        cnt++;
                    }
                    else{
                        System.out.println("No");
                        bc=false;
                        break;
                    }

                }
            }
            if(bc){
                System.out.println("Yes");
                for(long m: arr){
                    System.out.print(m+" ");
                }
                System.out.println();
            }
        }
    }
}
