package TLE_CP_31_SHEET.CP.CP_31_1000;

import java.util.ArrayList;
import java.util.Scanner;

public class ShowShuffling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long s[] = new long[n];
            for(int i=0; i<n; i++){
                s[i]= sc.nextLong();
            }
            ArrayList<Integer>list = new ArrayList<>();
            int cnt=1;
            boolean b =false;
            for(int i=1; i<n; i++){
                if(s[i]==s[i-1]){
                    cnt++;
                }
                else{
                    list.add(cnt);
                    if(cnt==1){
                        System.out.println(-1);
                        b=true;
                        break;
                    }
                    cnt=1;
                }
            }
            list.add(cnt);
            if(b)continue;
            if(cnt==1) {
                System.out.println(-1);
                continue;
            }

            long val=0;


            for(int i=0; i<list.size(); i++){
                val+=list.get(i);
                long x=list.get(i);
                long y=val;
                if(x%2!=0){
                    System.out.print(y--+" ");
                    x--;
                    long d=(y-x)+1;
                    while(x-->0){
                        System.out.print(d++ +" ");
                    }
                }

                else{
                    while(x-->0){
                        System.out.print(y--+" ");
                    }
                }
            }
            System.out.println();

        }
    }
}
