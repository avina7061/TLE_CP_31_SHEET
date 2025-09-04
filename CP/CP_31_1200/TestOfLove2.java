package TLE_CP_31_SHEET.CP.CP_31_1200;

import java.util.HashMap;
import java.util.Scanner;

public class TestOfLove2 {
    public static long solve(String s, int n, int m,int i){
        if(i>=n){
            return 0;
        }
        int val=0;
        if(s.charAt(i)=='C'){
            return Integer.MAX_VALUE;
        }
        else if(s.charAt(i)=='W'){
            return 1+solve(s,n,m,i+1);
        }
        else{
            long min=Integer.MAX_VALUE;
            for(int j=i+1; j<=i+m; j++){
                min= Math.min(min,solve(s,n,m,j));
            }
            return min;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            int m= sc.nextInt();
            int k =sc.nextInt();
            String p=sc.next();
            String s = "L"+p+"L";
            HashMap<Long,Long> map = new HashMap<>();

            long val = solve(s,n+2,m,0);
            if(val<=k){
//                System.out.println(val);
                System.out.println("Yes");
            }
            else System.out.println("No");

        }
    }
}
