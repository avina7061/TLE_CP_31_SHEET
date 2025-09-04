package TLE_CP_31_SHEET.CP.CP_31_1200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Vius {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            long n =sc.nextLong();
            int m = sc.nextInt();
            int arr[] = new int[m];
            for(int i=0; i<m; i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            ArrayList<Long>list = new ArrayList<>();
            long val =(arr[0]-1)+n-arr[m-1];
            list.add(val);
            for(int i=1; i<m; i++){
                list.add((long) (arr[i]-arr[i-1]-1));
            }
            Collections.sort(list);
//            for (long i:list){
//                System.out.println(i);
//            }
            long ans=0;
            int cnt=0;
            for(int i=list.size()-1; i>=0; i--){

                if(list.get(i)-cnt-1>=0){
                    if(list.get(i)-cnt-1==0){
                        ans+=1;
                    }
                   else ans+=list.get(i)-cnt-1;
//                   System.out.println(list.get(i)-cnt-1);
                }

                cnt+=4;

            }
            System.out.println(n-ans);
        }
    }
}
