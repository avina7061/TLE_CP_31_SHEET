package TLE_CP_31_SHEET.CP.CP_31_1100;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class CollectingGame2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long arr[]= new long[n];
            long sum=0;
            for(int i=0; i<n; i++){
                arr[i]= sc.nextLong();
                sum+=arr[i];
            }
            long cpy[]= arr.clone();
            Arrays.sort(cpy);
            HashMap<Long,Integer>map = new HashMap<>();
            int val=n-1;
            for(int i=n-1; i>=0; i--){
                if(i==n-1){
                    map.put(cpy[i],val);
                    sum-=cpy[i];
                }
                else{
                    if(sum>=cpy[i+1]){
                        map.put(cpy[i],val);
                    }
                    else{
                        val=i;
                        map.put(cpy[i],val);
                    }
                    sum-=cpy[i];
                }
            }
            for(int i=0; i<n; i++){
                System.out.print(map.get(arr[i])+" ");
            }
            System.out.println();
        }
    }
}
