package TLE_CP_31_SHEET.CP.CP_31_800;

import java.util.HashMap;
import java.util.Scanner;

public class DoremyPaint3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[]= new int[n];
            int valCnt=0;
            HashMap<Integer,Integer>map = new HashMap<>();
            for(int i=0; i<n; i++){
                arr[i]= sc.nextInt();
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
                valCnt++;
            }
            if(map.size()>2){
                System.out.println("No");
            }
            else if(map.size()==1){
                System.out.println("Yes");
            }
            else{
                int cnt1=0;
                int cnt2=0;
                for(int num:map.keySet()){
                    if(cnt1==0){
                        cnt1=map.get(num);
                    }
                    else cnt2= map.get(num);
                }
                if(valCnt%2==0) {
                    if(cnt1==cnt2)System.out.println("Yes");
                    else System.out.println("No");
                }
                else{
                    if(Math.abs(cnt1-cnt2)==1) System.out.println("Yes");
                    else System.out.println("No");
                }

            }
        }
    }
}
