package TLE_CP_31_SHEET.CP.CP_31_1000;

import java.util.Scanner;

public class PermutationWarmUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int min=0;
            int max=0;
            int val=n;
            for(int i=1; i<=n; i++){
                max+=Math.abs(val-i);
                val--;
            }

            int ans=max/2;
            System.out.println(ans+1);
        }
    }
}
