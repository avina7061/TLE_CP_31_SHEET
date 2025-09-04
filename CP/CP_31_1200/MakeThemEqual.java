package TLE_CP_31_SHEET.CP.CP_31_1200;

import java.util.Scanner;

public class MakeThemEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            char c = sc.next().charAt(0);
            String s = sc.next();
            boolean bool=true;
            for(int i=0; i<n; i++){
                if(s.charAt(i)!=c){
                    bool=false;
                    break;
                }
            }
            if(bool){
                System.out.println(0);
                continue;
            }
            int ind=-1;
            for(int i=n-1; i>=0; i--){
                if(s.charAt(i)==c){
                    ind=i+1;
                    break;
                }
            }
            if(ind>0&&ind*2>n){
                System.out.println(1);
                System.out.println(ind);
            }
            else{
                System.out.println(2);
                System.out.println((n-1)+" "+n);
            }
        }
    }
}
