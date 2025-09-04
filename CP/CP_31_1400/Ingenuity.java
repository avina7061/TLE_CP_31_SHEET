package TLE_CP_31_SHEET.CP.CP_31_1400;

import java.util.Scanner;
public class Ingenuity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            String s =sc.next();
            if(n==2){
                if(s.charAt(0)!=s.charAt(1)){
                    System.out.println("NO");
                }
                else{
                    System.out.println("RH");
                }
            }
            else if(n%2!=0){
                System.out.println("NO");
            }
            else{
                int N=0;
                int S=0;
                int E=0;
                int W=0;
                for(int i=0; i<n; i++){
                    if(s.charAt(i)=='N'){
                        N++;
                    }
                    else if(s.charAt(i)=='S'){
                        S++;
                    }
                    else if(s.charAt(i)=='E'){
                        E++;
                    }
                    else{
                        W++;
                    }
                }
                int dupS=0;
                int dupN=0;
                int dupE=0;
                int dupW=0;
                if(S>N){
                    dupS=S-N;
                }
                else{
                    dupN=N-S;
                }
                if(E>W){
                    dupE=E-W;
                }
                else{
                    dupW=W-E;
                }
//                System.out.println(dupN);
//                System.out.println(dupS);
//                System.out.println(dupE);
//                System.out.println(dupW);
                if(Math.abs(N-S)%2!=0||Math.abs(E-W)%2!=0){
                    System.out.println("NO");
                    continue;
                }
                char arr[] = new char[n];
                boolean b=false;
                for(int i=0; i<n; i++){
//                    System.out.println("yes");
                    if(s.charAt(i)=='N'){
                        if(dupN>0&&dupN%2==0){
                            b=true;
                            arr[i]='H';
                            dupN--;
                        }
                        else if(dupN>0&&dupN%2!=0){
                            b=true;
                            arr[i]='R';
                            dupN--;
                        }
                    }
                    if(s.charAt(i)=='S'){
                        if(dupS>0&&dupS%2==0){
                            b=true;
                            arr[i]='H';
                            dupS--;
                        }
                        else if(dupS>0&&dupS%2!=0){
                            b=true;
                            arr[i]='R';
                            dupS--;
                        }
                    }
                    if(s.charAt(i)=='E'){
                        if(dupE>0&&dupE%2==0){
                            b=true;
                            arr[i]='H';
                            dupE--;
                        }
                        else if(dupE>0&&dupE%2!=0){
                            b=true;
                            arr[i]='R';
                            dupE--;
                        }
                    }
                    if(s.charAt(i)=='W'){
                        if(dupW>0&&dupW%2==0){
                            b=true;
                            arr[i]='H';
                            dupW--;
                        }
                        else if(dupW>0&&dupW%2!=0){
                            b=true;
                            arr[i]='R';
                            dupW--;
                        }
                    }
                }
                if(b){
                    for(int i=0; i<n; i++){
                        if(arr[i]=='\u0000'){
                            arr[i]='R';
                        }
                    }
                }
                else{
                    int cn1=0;
                    int cn2=0;
                    if(W>0&&E>0){
                        for(int i=0; i<n; i++){
                            if(s.charAt(i)=='W'&&cn1<1){
                                arr[i]='R';
                                cn1++;
                            }
                            else if(s.charAt(i)=='E'&&cn2<1){
                                arr[i]='R';
                                cn2++;
                            }
                            else{
                                arr[i]='H';
                            }
                        }
                    }
                   else if(S>0&&N>0){
                       cn1=0;
                       cn2=0;
                        for(int i=0; i<n; i++){
                            if(s.charAt(i)=='S'&&cn1<1){
                                arr[i]='R';
                                cn1++;
                            }
                            else if(s.charAt(i)=='N'&&cn2<1){
                                arr[i]='R';
                                cn2++;
                            }
                            else{
                                arr[i]='H';
                            }
                        }
                    }
                }
                String ans="";
                 for(int i=0; i<n; i++){
                     ans+=arr[i];
                 }
                System.out.println(ans);
            }
        }
    }
}
