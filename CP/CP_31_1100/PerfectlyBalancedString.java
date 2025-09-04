package TLE_CP_31_SHEET.CP.CP_31_1100;

import java.util.HashSet;
import java.util.Scanner;

public class PerfectlyBalancedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            String s = sc.next();
            HashSet<Character>set = new HashSet<>();
            int i=0;
            for(i=0; i<s.length(); i++){
                if(set.contains(s.charAt(i))){
                    break;
                }
                set.add(s.charAt(i));
            }
            boolean bs=true;
            for(int j=i; j<s.length(); j++){
                if(s.charAt(j)!=s.charAt(j-i)){
                    bs=false;
                    break;
                }
            }
            if(bs) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
