package TLE_CP_31_SHEET.CP.CP_31_1200;

import java.util.*;

public class MatryoShakas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            long arr[] = new long[n];
            HashMap<Long,Integer>map = new HashMap<>();

            HashSet<Long>set = new HashSet<>();
            for(int i=0; i<n; i++){
                arr[i]= sc.nextInt();
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
                set.add(arr[i]);
            }
            ArrayList<Long> list = new ArrayList<>(set);
            Collections.sort(list);
            long sum=0;
            for(int i=1; i<list.size(); i++){
                if(list.get(i)==list.get(i-1)+1){
                    if(map.get(list.get(i))<map.get(list.get(i-1))){
                        sum+=map.get(list.get(i-1))-map.get(list.get(i));
                    }
                }
                else{
                    sum+=map.get(list.get(i-1));
                }
            }
            sum+=map.get(list.get(list.size()-1));
            System.out.println(sum);

        }
    }
}
