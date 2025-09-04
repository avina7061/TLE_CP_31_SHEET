package TLE_CP_31_SHEET.CP.CP_31_900;

import java.util.HashMap;
import java.util.Scanner;

public class ArrayCloningTechnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            HashMap<Integer,Integer>map = new HashMap<>();
            int max = Integer.MIN_VALUE;
            for(int i=0; i<n; i++){
                arr[i]= sc.nextInt();
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
                if(map.get(arr[i])>max){
                    max=map.get(arr[i]);
                }
            }
            int rest= arr.length-max;
            int ans=0;

            while(rest!=0){
                if(rest>max){
                    ans+=(1+max);
                    rest-=max;
                    max=2*max;
                }
                else{
                    ans+=(1+rest);
                    rest=0;
                }
            }
            System.out.println(ans);
        }

    }
}
