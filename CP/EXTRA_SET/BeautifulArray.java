package TLE_CP_31_SHEET.CP.EXTRA_SET;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class BeautifulArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            long k =sc.nextLong();
            long arr[] = new long[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextLong();
            }
            HashMap<Long, ArrayList<Long> >map = new HashMap<>();
            for(int i=0; i<n; i++){
                long val=arr[i]%k;
                ArrayList<Long> list = map.getOrDefault(val,new ArrayList<>());
                list.add(arr[i]/k);
                map.put(val,list);
            }
            long oddCnt=0;
            for(long i: map.keySet()){
                ArrayList<Long>list = map.get(i);
                if((list.size()&1)==1){
                    oddCnt++;
                }
            }
            if(n%2==0&&oddCnt>0||n%2!=0&&oddCnt>1){
                System.out.println(-1);
                continue;
            }
            long ans=0;
            for(long i: map.keySet()){
                ArrayList<Long>list = map.get(i);
                Collections.sort(list);
                if(list.size()==1){
                    continue;
                }
                if((list.size()&1)==0){
                    for(int j=0; j<list.size()-1; j+=2){
                        ans+=Math.abs(list.get(j+1)-list.get(j));
                    }
                }
                else{
                    int m=list.size();
                    long pre[] = new long[m/2];
                    long suff[] = new long[m/2];
                    int ind=0;
                    long v=0;
                    for(int j=0; j<m-1; j+=2){
                        v+=Math.abs(list.get(j+1)-list.get(j));
                       pre[ind]=v;
//                        System.out.print(v+" ");
                       ind++;
                    }
//                    System.out.println();
                    v=0;
                    ind= suff.length-1;
                    for(int j=list.size()-1; j>0; j-=2){
                        v+=Math.abs(list.get(j)-list.get(j-1));
                        suff[ind]=v;
//                        System.out.print(v+" ");
                        ind--;
                    }
//                    System.out.println();
                    long val=Long.MAX_VALUE;
                    long vt=0;
                    for(int p=0; p<m; p+=2){
                        if(p==0){
                            val=Math.min(val,suff[p/2]);
//                            System.out.println("exe1");
//                            System.out.println(suff[p/2]);
                        }
                        else if(p==m-1){
                            val=Math.min(val,pre[p/2-1]);
//                            System.out.println("exe2");
//                            System.out.println(pre[p/2-1]);
                        }
                        else{
//                            System.out.println("exe3");
                            val=Math.min(val,pre[p/2-1]+suff[p/2]);
                        }
                    }
                    ans+=val;
                }
            }
            System.out.println(ans);
        }
    }
}
