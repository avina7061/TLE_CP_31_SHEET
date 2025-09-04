package TLE_CP_31_SHEET.CP.CP_31_1200;

import java.util.Scanner;

public class BinaryStringBattle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            int cnt1=0;
            for(int i: s.toCharArray()){
                if(i=='1'){
                    cnt1++;
                }
            }
            if(n/2+1<=k||cnt1<=k){
                System.out.println("Alice");
            }
            else{
                System.out.println("Bob");
            }
        }
    }
}
