package TLE_CP_31_SHEET.CP.CP_31_1300;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MexCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i]= sc.nextInt();
            }
            Arrays.sort(arr);
            int Mex=0;
            HashMap<Integer,Integer>map = new HashMap<>();
            for(int i=0; i<n; i++){
                if(arr[i]<=Mex){
                    map.put(arr[i],map.getOrDefault(arr[i],0)+1);
                }
                if(arr[i]<Mex){
                    continue;
                }
               else if(arr[i]==Mex){
                    Mex++;
                    continue;
                }
               else{
                   break;
                }
            }

            HashMap<Integer,Integer>map2 = new HashMap<>();

            for(int i: map.keySet()){
                map2.put(map.get(i),map2.getOrDefault(map.get(i),0)+1);
            }
            int ans[] = new int[n+1];
            int cnt=1;
            for(int i=n; i>n-Mex; i--){
                ans[i]=cnt;
                cnt++;
            }
            ans[0]=1;
            for(int i=1; i<=n-Mex; i++){
                ans[i]=ans[i-1]+map2.getOrDefault(i,0);
            }
            for(int i: ans){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
