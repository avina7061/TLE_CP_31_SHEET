package TLE_CP_31_SHEET.CP.CP_31_1300;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class GoodArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][2];

        for(int i=0; i<n; i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=i+1;

        }
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        HashMap<Integer,Integer>map = new HashMap<>();
        HashSet<Integer>list = new HashSet<>();
        long sum=0;
        int c =-1;
        for(int i=0; i<n; i++){


            if(i==n-2&&sum==arr[i][0]){
                list.add(arr[i+1][1]);
            }
            if(i==n-1){
                int val =(int) (sum-arr[i][0]);
//                System.out.println(sum);
//                System.out.println(val);
                if(map.getOrDefault(val,0)!=0){
                    c =val;
                }

            }
            sum+=arr[i][0];
            map.put(arr[i][0],map.getOrDefault(arr[i][0],0)+1);
        }
//        System.out.println(c);
        if(c!=-1){
            for(int i[]: arr){
                if(i[0]==c){
                    list.add(i[1]);
                }
            }
        }
        if(list.isEmpty()){
            System.out.println(0);
            System.out.println();
        }
        else{
            System.out.println(list.size());
            for(int i: list){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
