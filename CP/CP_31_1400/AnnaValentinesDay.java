package TLE_CP_31_SHEET.CP.CP_31_1400;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AnnaValentinesDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            int m =sc.nextInt();
            long arr[] = new long[n];
            ArrayList<ArrayList<Integer>>zero = new ArrayList<>();
            long dp[][] = new long[n][2];
            ArrayList<Integer>nonZero = new ArrayList<>();
            for(int i=0; i<arr.length; i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0; i<arr.length; i++){
                long val=arr[i];
                long x=10;
                int cnt=0;
                if(arr[i]%10==0){
                    while(val%x==0){
                        cnt++;
                        val/=10;
                    }
                    if(cnt>0){
                        ArrayList<Integer>li = new ArrayList<>();
                        String s=String.valueOf(val);
                        li.add(s.length());
                        li.add(cnt);
                        zero.add(li);
                    }
                }
                else{
                    nonZero.add(String.valueOf(arr[i]).length());
                }
            }
            int sum=0;
            Collections.sort(zero, (a, b) -> b.get(1) - a.get(1));
//            for(ArrayList<Integer>list :zero){
//                System.out.println(list.get(0)+" "+list.get(1));
//            }
boolean bool=true;
            for(int i=0; i<zero.size(); i++){
              ArrayList<Integer>tmp=zero.get(i);
              if(bool){
//                  System.out.println("a "+tmp.get(0));
                  sum+=tmp.get(0);
                  bool=false;
              }
              else{
//                  System.out.println("b "+(tmp.get(0)+tmp.get(1)));
                  sum+=(tmp.get(0)+tmp.get(1));
                  bool=true;
              }

            }
            int s=0;
            for(int i=0; i<nonZero.size(); i++){
                sum+=nonZero.get(i);
                s+=nonZero.get(i);
            }
//            System.out.println("nonZero"+s);
//            System.out.println(sum);
            if(sum>m){
                System.out.println("Sasha");
            }
            else{
                System.out.println("Anna");
            }
        }
    }
}
