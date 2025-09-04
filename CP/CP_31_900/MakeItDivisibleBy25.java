package TLE_CP_31_SHEET.CP.CP_31_900;


import java.util.ArrayList;
import java.util.Scanner;

public class MakeItDivisibleBy25 {
    public static  int minOpr(String n, String s){
        int lastInd=-1;
        int startInd=-1;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)==n.charAt(1)){
                lastInd=i;
                break;
            }
        }
        for(int i=lastInd-1; i>=0; i--){
            if(s.charAt(i)==n.charAt(0)){
                startInd=i;
                break;
            }
        }
        if(lastInd==-1||startInd==-1)return Integer.MAX_VALUE;
        else return ((lastInd-startInd)-1)+(s.length()-lastInd)-1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            String s = sc.next();
            ArrayList<String>list = new ArrayList<>();
            list.add("00");
            list.add("25");
            list.add("50");
            list.add("75");
            int ans = Integer.MAX_VALUE;
            for(int i=0; i<list.size(); i++){
                ans=Math.min(ans,minOpr(list.get(i),s));
            }
            System.out.println(ans);
        }
    }
}
