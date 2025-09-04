package TLE_CP_31_SHEET.CP.CP_31_1200;

import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int q= sc.nextInt();
            String a= sc.next();
            String b = sc.next();

            while(q-->0){
                int l = sc.nextInt();
                int r = sc.nextInt();
                int x[] = new int[26];

                for(int i=l-1; i<r; i++){
                   x[a.charAt(i)-'a']++;
                   x[b.charAt(i)-'a']--;
                }
                int cnt=0;
                for(int i=l; i<r; i++){
                    cnt+=Math.abs(x[a.charAt(i)-'a']);
                    x[a.charAt(i)-'a']=0;
                }
                System.out.println(cnt/2);
            }
        }
    }
}
