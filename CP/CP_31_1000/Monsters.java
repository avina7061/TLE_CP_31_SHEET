package TLE_CP_31_SHEET.CP.CP_31_1000;
//show TLE

import java.util.*;

public class Monsters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            long arr[] = new long[n];
            HashSet<Long>set = new HashSet<>();

            for(int i=0; i<n; i++){
                arr[i]= sc.nextInt();
                arr[i]%=k;
                set.add(arr[i]);
            }
            ArrayList<Integer>list = new ArrayList<>();
            PriorityQueue<Long>pq = new PriorityQueue<>(Collections.reverseOrder());
            for(int i=0; i<n; i++){
                if(arr[i]==0){
                    list.add(i+1);
                }
            }
            for(long i: set){
                if(i!=0){
                    pq.add(i);
                }
            }

            while(!pq.isEmpty()){
                long val = pq.poll();
                for(int i=0;i<n; i++){
                    if(arr[i]==val){
                        list.add(i+1);
                    }
                }
            }
             for(int i: list){
                 System.out.print(i+" ");
             }
            System.out.println();
        }
    }
}
