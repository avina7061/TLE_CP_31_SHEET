package TLE_CP_31_SHEET.Contest.Codeforces_Global_Round_29;

import java.util.Scanner;

public class bMultipleConstruction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            for(int i=n-1; i>=1; i--){
                System.out.print(i+" ");
            }
            System.out.print(n+" ");
            for(int i=1; i<=n; i++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
