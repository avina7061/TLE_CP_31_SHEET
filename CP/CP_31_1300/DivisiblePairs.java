package TLE_CP_31_SHEET.CP.CP_31_1300;

import java.util.Scanner;

public class DivisiblePairs {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            long val=1;
            long arr[] = new long[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextLong();
                val*=arr[i];
            }
            double x = Math.pow(val, 1.0 / n);
            long y=(long)x;
            y*=100000;
            double z= x*100000;
//            System.out.println((double) y);
//            System.out.println(x);
//            System.out.println((double)y*0.1);
            if( y == (long)z){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
