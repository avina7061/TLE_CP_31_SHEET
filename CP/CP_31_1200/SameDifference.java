package TLE_CP_31_SHEET.CP.CP_31_1200;

import java.util.HashMap;
import java.util.Scanner;

public class SameDifference {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
HashMap<Integer,Integer> map = new HashMap<>();
            for(int i=0; i<n; i++){
                map.put(arr[i]-(i+1),map.getOrDefault(arr[i]-(i+1),0)+1);
            }
            long sum=0;
            for(int i:map.keySet()){
                sum+=(((long) map.get(i) *(map.get(i)-1))/2);
            }
            System.out.println(sum);

        }
    }
}
