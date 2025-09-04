package TLE_CP_31_SHEET.CP.CP_31_1000;

import java.util.Scanner;

public class RedVersusBlue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int r = sc.nextInt();
            int b = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            if(r%(b + 1)==0){
                int val=r/(b+1);
                int x=val;
                while(r!=0||b!=0){
                    if(x>0){
                        sb.append("R");
                        x--;
                        r--;
                    }
                    else{
                        x=val;
                        sb.append("B");
                        b--;
                    }
                }
            }
            else{
                int val=r/(b+1);
                int x=val;
                int rem =r%(b+1);
                while(r!=0||b!=0){
                    if(x>0){
                        sb.append("R");
                        x--;
                        r--;
                        if(rem>0&&x==0){
                            sb.append("R");
                            r--;
                            rem--;
                        }
                    }
                    else{
                        x=val;
                        sb.append("B");
                        b--;
                    }
                }
            }
            System.out.println(sb.toString());
        }
    }
}
