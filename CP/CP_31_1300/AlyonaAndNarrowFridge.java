package TLE_CP_31_SHEET.CP.CP_31_1300;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AlyonaAndNarrowFridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long h = sc.nextLong();
        long arr[] =new long[n];
        long freq[] = new long[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextLong();
        }
ArrayList<long []>list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long[] copy = Arrays.copyOf(arr, i + 1);
            Arrays.sort(copy);
            list.add(copy);
        }

//        for(long f[]:list){
//            for(long m: f){
//                System.out.print(m+" ");
//            }
//            System.out.println();
//        }
        long ans=0;
        int val=0;
        for(int i=n; i>=1; i--){
            long acc[] = list.get(i-1);
            long temp=h;
            boolean c =true;
            for(int j=acc.length-1; j>=0; j-=2){
                if(temp>=acc[j]){
                    temp-=acc[j];
                }
                else{
                    c=false;
                    break;
                }
            }
            val++;
            if(c) {
                System.out.println(acc.length);
                        break;
            }
        }

    }
}
