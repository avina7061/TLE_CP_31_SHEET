package TLE_CP_31_SHEET.CP.CP_31_1200;

import java.util.HashMap;
import java.util.Scanner;

public class MArrays {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n =sc.nextInt();
            int m=sc.nextInt();
            long arr[] = new long[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextLong();
            }

            HashMap<Integer,Integer>map = new HashMap<>();
            for(int i=0; i<n; i++){
                map.put((int)arr[i]%m,map.getOrDefault((int)arr[i]%m, 0)+1);
            }

            long sum=0;
            for(int i=0; i<=m/2; i++) {
                if(i==0){
                    if(map.getOrDefault(i,0)!=0){
                        sum+=1;
                    }
                    continue;
                }
                else if(i==m/2 && m%2==0){
                    if(map.getOrDefault(i,0)!=0){
                        sum+=1;
                    }
                    continue;
                }

                if(map.getOrDefault(i,0)==0 && map.getOrDefault(m-i,0)==0) continue;

                if(map.getOrDefault(i,0)==map.getOrDefault(m-i,0)){
                    sum+=1;
                }
                else {
                    sum +=  Math.abs(map.getOrDefault(i,0)-map.getOrDefault(m-i,0)) ;
                }
            }

            System.out.println(sum);
        }
    }
}
