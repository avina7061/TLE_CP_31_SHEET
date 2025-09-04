package TLE_CP_31_SHEET.CP.CP_31_1200;

import java.util.Scanner;

public class TestOfLove3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            int m =sc.nextInt();
            int k =sc.nextInt();
            String p = sc.next();
            String s ="L"+p+"L";
            int water[] = new int[s.length()];
            int log[] = new int[s.length()];
            water[s.length()-1]=-1;
            log[s.length()-1]=s.length()-1;
            for(int i=s.length()-2; i>=0; i--){
                if(s.charAt(i)=='W'){
                    water[i]=i;
                }
                else{
                    water[i]=water[i+1];
                }
                if(s.charAt(i)=='L'){
                    log[i]=i;
                }
                else{
                    log[i]=log[i+1];
                }
            }
//            for(int i: log){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//            for(int i: water){
//                System.out.print(i+" ");
//            }
            int i=0;
            boolean bool =true;
            while(i<s.length()-1){
//                System.out.println(i);
                if(s.charAt(i)=='C'){
                    System.out.println("No");
                    bool=false;
                    break;
                }
                int ldist =log[i+1]-i;
                if(log[i+1]!=-1&&ldist<=m){
                    i=log[i+1];
                    continue;
                }
                if(i+m>=s.length()-1){
                    System.out.println("Yes");
                    bool=false;
                    break;
                }
                int wdist =water[i+m]-i;
                if(water[i+m]!=-1&&wdist<=m&&k>0){
                    i=water[i+m]+1;
                    k--;
                    continue;
                }
                System.out.println("No");
                bool=false;
                break;
            }
            if(bool) System.out.println("Yes");
        }
    }
}
