package TLE_CP_31_SHEET.CP.CP_31_1200;

import java.util.HashSet;
import java.util.Scanner;

public class DistrictConnection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long arr[] = new long[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
            boolean flag =true;
            long val=arr[0];
            for(int i=1; i<n; i++){
                if(val!=arr[i]){
                    flag=false;
                    break;
                }
            }
            if(flag) System.out.println("No");
            HashSet<Long> set = new HashSet<>();
            if(!flag){
                System.out.println("Yes");
                for(int i=0; i<n; i++){
                    for(int j =i+1; j<n; j++){
                        if(arr[i]!=arr[j]&&(!set.contains((long)(i+1))||!set.contains((long)(j+1)))){
                            System.out.println((i+1)+" "+(j+1));
                            set.add((long)(i+1));
                            set.add((long)(j+1));
                        }
                        if(set.size()==n){
                            break;
                        }
                    }
                }
            }
        }
    }
}
