package TLE_CP_31_SHEET.CP.CP_31_900;

import java.util.HashSet;
import java.util.Scanner;

public class DeletiveEditing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s=sc.next();
            String p = sc.next();
            int m = p.length()-1;
            boolean b =false;
            HashSet<Character> st = new HashSet<>();
            for(int i=s.length()-1; i>=0; i--){
                if(m>=0&&p.charAt(m)==s.charAt(i)&& !st.contains(p.charAt(m))){
                    m--;
                    continue;
                }
                else if(m>=0&&st.contains(p.charAt(m))){
                    m--;
                    b=true;
                    break;
                }
                else{
                    st.add(s.charAt(i));
                }
            }
            if(m>=0) System.out.println("No");
           else if(b) System.out.println("No");
            else System.out.println("Yes");
        }
    }
}
