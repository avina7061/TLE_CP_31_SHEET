package TLE_CP_31_SHEET.CP.CP_31_800;

import java.util.Scanner;

public class CoverInWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int max=0; int count=0;
            int m=0;
            for(int i=0; i<n; i++){
                if(s.charAt(i)=='.'){
                    m++;
                    count++;
                }
                else{
                    max=Math.max(count,max);
                    count=0;
                }
            }
            max=Math.max(count,max);
            if(max>=3) System.out.println(2);
            else  System.out.println(m);
        }
    }
}
