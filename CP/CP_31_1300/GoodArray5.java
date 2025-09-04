package TLE_CP_31_SHEET.CP.CP_31_1300;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GoodArray5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        HashMap<Long,Integer>map = new HashMap<>();
        long sum=0;
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
            map.put((long)arr[i],map.getOrDefault((long)arr[i],0)+1);
        }
        int ans=0;
        ArrayList<Integer>list = new ArrayList<>();
        for(int i=0; i<n;i++){
            long temp=sum-arr[i];
            if(temp%2==0){
                int val=map.getOrDefault(temp/2,0);
                if(temp/2==arr[i]){
                    if(val>=2){
                        ans++;
                        list.add(i+1);
                    }
                }
                else{
                    if(val>=1){
                        ans++;
                        list.add(i+1);
                    }
                }
            }

        }
        System.out.println(list.size());
        if(list.isEmpty()){
            System.out.println(" ");
        }
        else {
            for (int i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
