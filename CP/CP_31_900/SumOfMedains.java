package TLE_CP_31_SHEET.CP.CP_31_900;

import java.util.Scanner;

public class SumOfMedains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            long arr[] = new long[n*k];
            for(int i=0; i<n*k; i++){
                arr[i]= sc.nextLong();
            }
            int val=0;
            if(n%2==0){
                val=(n/2)+1;
            }
            else{
                val=(n/2)+1;
            }
            int cnt=0;
            long sum=0;
            for(int i =(n*k)-val; i>=0; i-=val){
                if(cnt<k){
                    sum+=arr[i];
                    cnt++;
                }
            }
            System.out.println(sum);
        }
    }
}
