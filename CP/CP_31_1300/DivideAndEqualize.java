package TLE_CP_31_SHEET.CP.CP_31_1300;

import java.util.HashMap;
import java.util.Scanner;

public class DivideAndEqualize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n; i++){
                arr[i]=sc.nextInt();
            }
            HashMap<Integer,Integer>map = new HashMap<>();
            for(int i=0; i<n; i++){
                int val= arr[i];
//                System.out.println(val);
                if(val<=3&&val!=1){
                    map.put(val,map.getOrDefault(val,0)+1);
                    continue;
                }
                int j=2;
                int x=val;
                while(j<=Math.sqrt(x)&&val!=1){
                    if(val%j==0){
                        map.put(j,map.getOrDefault(j,0)+1);
                        val=val/j;
//                        System.out.println("val"+val);
//                        System.out.println("map"+j+" "+map.get(j));
                    }
                    else{
                        j++;
                    }
                }
                if(val!=1){
                    map.put(val,map.getOrDefault(val,0)+1);
                }
            }
            boolean tr=true;
            for(int i: map.keySet()){
//                System.out.println(i+" "+map.get(i));
            }
            for(int i: map.keySet()){
//                System.out.println(map.get(i));
                if(map.get(i)%n!=0){
                    System.out.println("No");
                    tr=false;
                    break;
                }
            }

            if(tr) System.out.println("Yes");
        }
    }
}
