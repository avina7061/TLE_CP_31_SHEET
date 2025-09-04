package TLE_CP_31_SHEET.CP.CP_31_1100;

import java.util.HashSet;
import java.util.Scanner;

public class EraseFirstOrSecond {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            String s = sc.next();
            HashSet<Character>set= new HashSet<>();
            long sum=0;
            for(int i=0; i<n; i++){
                set.add(s.charAt(i));
                sum+= set.size();
            }
            System.out.println(sum);
        }
    }
}
