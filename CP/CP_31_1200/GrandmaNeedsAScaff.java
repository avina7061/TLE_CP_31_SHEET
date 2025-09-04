package TLE_CP_31_SHEET.CP.CP_31_1200;

import java.util.Scanner;

public class GrandmaNeedsAScaff {
    public static boolean palindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s= sc.next();
            if(palindrome(s)){
                System.out.println(0);
                continue;
            }
            int i=0;
            int j=n-1;
            int ind1=-1;
            int ind2 =-1;
            while(i<j){
                if(s.charAt(i)!=s.charAt(j)){
                    ind1=i;
                    ind2=j;
                    break;
                }
                i++;
                j--;
            }
//            System.out.println("ind1"+ind1+"ind2"+ind2);
            //for ind1
            int cnt=0;
            i=0;
            j=n-1;
            int ans=Integer.MAX_VALUE;
            boolean b =true;
            while(i<j){
                if(s.charAt(i)!=s.charAt(j)){
                    if(s.charAt(i)==s.charAt(ind1)){
                        cnt++;
                        i++;
                        continue;
                    }
                    else if(s.charAt(j)==s.charAt(ind1)){
                        cnt++;
                        j--;
                        continue;
                    }
                    else{
                        b=false;
                        break;
                    }
                }
                i++;
                j--;
            }
            if(b){
                ans=Math.min(ans,cnt);
            }
               b=true;
                cnt=0;
                i=0;
                j=n-1;

                while(i<j){
                    if(s.charAt(i)!=s.charAt(j)){
                        if(s.charAt(i)==s.charAt(ind2)){
                            cnt++;
                            i++;
                            continue;
                        }
                        else if(s.charAt(j)==s.charAt(ind2)){
                            cnt++;
                            j--;
                            continue;
                        }
                        else{

                            b=false;
                            break;
                        }
                    }
                    i++;
                    j--;
                }
                if(b){
                    System.out.println(Math.min(ans,cnt));
                }
                else if(ans!=Integer.MAX_VALUE){
                    System.out.println(ans);
                }
                else{
                    System.out.println(-1);
                }


        }
    }
}
