package TLE_CP_31_SHEET.CP.CP_31_1300;

import java.util.Scanner;

public class WowFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            String s = sc.next();
            int pre[] = new int[s.length()];
            int suff[] = new int[s.length()];
            int val=0;
            int cnt=0;
            if(s.charAt(0)=='v')cnt++;
            pre[0]=0;
            for(int i=1; i<s.length(); i++){
                if(s.charAt(i)=='v'){
                    cnt++;
                }
                if(cnt>1)pre[i]=(cnt-1)+val;
                else pre[i]=val;
                if(s.charAt(i)=='o'){
                    val=pre[i];
                    cnt=0;
                }
//                System.out.println(pre[i]);
            }
            val=0;
            cnt=0;
            if(s.charAt(s.length()-1)=='v')cnt++;
            suff[s.length()-1]=0;
            for(int i=s.length()-2; i>=0; i--){
                if(s.charAt(i)=='v'){
                    cnt++;
                }
                if(cnt>1)suff[i]=(cnt-1)+val;
                else suff[i]=val;

                if(s.charAt(i)=='o'){
                    val=suff[i];
                    cnt=0;
                }
            }
//            for(int i: pre){
//                System.out.println(i);
//            }
//            System.out.println("suffix");
//            for(int i: suff){
//                System.out.println(i);
//            }

            long ans=0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='o'){
                    ans+=((long)pre[i]*suff[i]);
                }
            }
            System.out.println(ans);
        }
    }

//vvovooovovvovoovoovvvvovovvvov
