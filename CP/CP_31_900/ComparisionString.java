package TLE_CP_31_SHEET.CP.CP_31_900;

import java.util.Scanner;

public class ComparisionString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int cnt=2;
            int max=0;
            for(int i=1; i<n; i++){
                if(s.charAt(i)==s.charAt(i-1)){
                    cnt++;
                }
                else{
                    max=Math.max(max,cnt);
                    cnt=2;
                }
            }
            max=Math.max(cnt,max);
            System.out.println(max);
        }
    }
}
