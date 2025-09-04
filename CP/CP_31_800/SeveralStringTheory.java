package TLE_CP_31_SHEET.CP.CP_31_800;

import java.util.Scanner;

public class SeveralStringTheory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            int k =sc.nextInt();
            String s =sc.next();
            boolean b =true;
            char ch = s.charAt(0);
            for(int i=1; i<n; i++){
                if(s.charAt(i)!=ch){
                    b=false;
                    break;
                }
            }
            if(b){
                System.out.println("No");
                continue;
            }
            if(k==0) {
                boolean bt = true;
                int i = 0;
                int j = n - 1;
                while (i < j) {
                    if (s.charAt(i) > s.charAt(j)) {
                        bt = false;
                        System.out.println("No");
                        break;
                    }
                    i++;
                    j--;
                }
                if (bt) {
                    StringBuilder sb = new StringBuilder(s);
                    if(sb.reverse().toString().equals(s)){
                        System.out.println("No");
                    }
                    else{
                        System.out.println("Yes");
                    }

                }
                continue;
            }
            System.out.println("Yes");
        }
    }
}
