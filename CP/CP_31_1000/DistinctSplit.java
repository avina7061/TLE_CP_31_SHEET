package TLE_CP_31_SHEET.CP.CP_31_1000;

import java.util.HashSet;
import java.util.Scanner;

public class DistinctSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int prefix[] = new int[n];
            int suffix[]= new int[n];
            HashSet<Character>set = new HashSet<>();
            HashSet<Character>set2 = new HashSet<>();
            for(int i=0; i<n; i++){
                set.add(s.charAt(i));
                prefix[i]=set.size();
                set2.add(s.charAt(n-(i+1)));
                suffix[n-(i+1)]=set2.size();
            }
            int max =Integer.MIN_VALUE;
            for(int i=0; i<n; i++){
               if(i<n-1){
                   max=Math.max(max,prefix[i]+suffix[i+1]);
               }
            }
            System.out.println(max);
        }
    }
}
