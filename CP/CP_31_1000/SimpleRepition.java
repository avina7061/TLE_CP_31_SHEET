package TLE_CP_31_SHEET.CP.CP_31_1000;

import java.util.Scanner;

public class SimpleRepition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            long x=sc.nextLong();
            int k =sc.nextInt();
            if(x==1&&k==1){
                System.out.println("No");
                continue;
            }
            if(x==1){
                StringBuilder sb = new StringBuilder();
                for(int i=0; i<k; i++){
                    sb.append(x);
                }
                int val = Integer.parseInt(sb.toString());
                boolean bool=true;
                for(int i=2; i<=Math.sqrt(val); i++){
                    if(val%i==0){
                        bool=false;
                        break;
                    }
                }
                System.out.println((bool)?"Yes":"No");
            }
            else if(k==1){
                boolean bool=true;
                for(int i=2; i<=Math.sqrt(x); i++){
                    if(x%i==0){
                        bool=false;
                        break;
                    }
                }
                System.out.println((bool)?"Yes":"No");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
