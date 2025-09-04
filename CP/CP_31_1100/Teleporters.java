package TLE_CP_31_SHEET.CP.CP_31_1100;

import java.util.Arrays;
import java.util.Scanner;

public class Teleporters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long c= sc.nextLong();
            long arr[] = new long[n];
            for(int i=0; i<n; i++){
                arr[i]= sc.nextLong();
            }
            long pre[] = new long[n];
            for(int i=0; i<n; i++){
                pre[i]=i+1+arr[i];
            }
            Arrays.sort(pre);
            long cnt=0;
            for(int i=0; i<n; i++){
                if(pre[i]<=c){
                    c-=pre[i];
                    cnt++;
                }
                else break;
            }
            System.out.println(cnt);
        }
    }
}
