package TLE_CP_31_SHEET.CP.EXTRA_SET;

import java.util.*;

public class CP_31_1400 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            int val=-1;

            HashSet<Integer>st = new HashSet<>();
            ArrayList<Integer>li = new ArrayList<>();
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
                st.add(arr[i]);
                li.add(arr[i]);
            }

            ArrayList<Integer>list = new ArrayList<>(st);
            Collections.sort(list);
            for(int i=0; i<list.size(); i++){
                if(i!=list.get(i)){
                    val=i;
                    break;
                }
            }
            boolean b=false;
            if(val==-1){
                val=list.size()+1;
                b=true;
            }
            Collections.sort(li);

            int ans[] = new int[n+1];
            ans[0]=1;
            HashMap<Integer,Integer>mp = new HashMap<>();
            int cnt=1;
            for(int i=1;i<li.size(); i++){
                if(arr[i]==arr[i-1]&&arr[i]<val){
                    cnt++;
                }
                else if(arr[i]<val){
                    mp.put(cnt,mp.getOrDefault(cnt,0)+1);
                    cnt=1;
                }
            }
            mp.put(cnt,mp.getOrDefault(cnt,0)+1);
          for(int i=1; i<li.size(); i++){
              if(b){
                  ans[i]=mp.get(i)+ans[i-1];
              }
              else{
                  ans[i]=mp.get(i);
              }
          }
        }
    }
}
