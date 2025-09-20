package TLE_CP_31_SHEET.Contest.Codeforces_Global_Round_29;

import java.util.Scanner;

public class cRabbits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            String s =sc.next();
            boolean ans =true;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='0'){
                    ans=false;
                    break;
                }
            }
            if(ans) {
                System.out.println("Yes");
                continue;
            }
            ans=true;
            char[] arr = s.toCharArray();
            for(int i=0; i<s.length(); i++){
                if(arr[i]=='0') {
                    if (i == 0 || i == n - 1) {
                        continue;
                    }
                    else if(arr[i-1]=='0'||arr[i+1]=='0'||arr[i-1]=='2')continue;

                    else if(i-2>=0&&arr[i-2]=='0')continue;

                    else if(i+2<n&&arr[i+2]=='0'){
//                        System.out.println(i);
                        arr[i+2]='2';
                        continue;
                    }
                    else{
//                      System.out.println(i);
                        System.out.println("No");
                        ans=false;
                        break;
                    }
                }
            }
            if(ans) System.out.println("Yes");
        }
    }
}
