package TLE_CP_31_SHEET.CP.CP_31_1100;

import java.util.Scanner;

public class PaintTheArray {
    public static  long GCD(long a, long b){
        if(b==0)return a;
        return GCD(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long arr[] = new long[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextLong();
            }
            long val=0;
           for(int i=1; i<n; i+=2){
               val=GCD(val,arr[i]);
           }
           long d1=val;
           if(val>1){
               boolean b =true;
               for(int i=0; i<n; i+=2){
                   if(arr[i]%val==0){
                       b=false;
                       break;
                   }
               }
               if(b){
                   System.out.println(val);
                   continue;
               }

           }
           val=0;
            for(int i=0; i<n; i+=2){
                val=GCD(val,arr[i]);
            }
            long d2=val;
            if(val>1){
                boolean b =true;
                for(int i=1; i<n; i+=2){
                    if(arr[i]%val==0){
                        b=false;
                        break;
                    }
                }
                if(b) {
                    System.out.println(val);
                    continue;
                }

            }
                System.out.println(0);
        }
    }
}
