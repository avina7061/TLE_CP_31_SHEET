package TLE_CP_31_SHEET.CP.CP_31_1100;

import java.util.Scanner;

public class Quests {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            int brr[]= new int[n];
            for(int i=0; i<n; i++){
                arr[i]= sc.nextInt();
            }
            for(int i=0; i<n; i++){
                brr[i]= sc.nextInt();
            }
            int max=Integer.MIN_VALUE;
            long ans=Long.MIN_VALUE;
            int cnt=1;
            long mul=0;
           for(int i=0; i<n; i++){
               max=Math.max(brr[i],max);
               mul+=arr[i];
            if(k>=cnt){
                ans=Math.max(ans,(max*(k-cnt)+mul));
            }
            cnt++;
           }
            System.out.println(ans);
        }
    }
}
