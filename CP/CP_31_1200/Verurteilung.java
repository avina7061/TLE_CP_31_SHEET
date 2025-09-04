package TLE_CP_31_SHEET.CP.CP_31_1200;

import java.util.Scanner;

public class Verurteilung {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s=sc.next();
            boolean b =true;
            for(int i=0; i<26; i++){
                char ch =(char) (97+i);
                String a ="";
                a+=ch;
                if(!s.contains(a)){
                    System.out.println(a);
                    b=false;
                    break;
                }
            }

            if(b){
                for(int i=0; i<26; i++){
                    for(int j=0; j<26; j++){
                        char ch =(char)(97+i);
                        char ch2 =(char)(97+j);
                        String a ="";
                        a+=ch;
                        a+=ch2;
                        if(!s.contains(a)){
                            System.out.println(a);
                            b=false;
                            break;
                        }
                    }
                    if(!b)break;
                }
            }
            if(b){
                String st="aaa";
                String st2="aed";
                if(!s.contains(st)){
                    System.out.println(st);
                    continue;
                }
                System.out.println(st2);
            }
        }
    }
}
