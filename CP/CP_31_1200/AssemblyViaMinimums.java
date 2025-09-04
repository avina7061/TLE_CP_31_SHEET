package TLE_CP_31_SHEET.CP.CP_31_1200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class AssemblyViaMinimums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int x=n*(n-1)/2;
            long arr[] = new long[x];
            long ans[] = new long[n];
            HashMap<Long,Long> map = new HashMap<>();
            for(int i=0; i<x; i++){
                arr[i]= sc.nextLong();
                map.put(arr[i],map.getOrDefault(arr[i],0l)+1);
            }
            ArrayList<Long>list = new ArrayList<>();
            for(long i: map.keySet()){
                list.add(i);
            }
            Collections.sort(list);
            int val=n-1;
            int ind=0;
            int i=0;
           while(i<n){
               if(ind<list.size()){
                   long num=map.get(list.get(ind));
                   while(i<n&&num>0){
                       ans[i]=list.get(ind);
                       num-=val;
                       val--;
                       i++;
                   }
                   ind++;
                   if(ind== list.size())break;
               }
            }
           ans[n-1]=1000000000l;
            for(long ic: ans){
                System.out.print(ic+" ");
            }
            System.out.println();
        }
    }
}
