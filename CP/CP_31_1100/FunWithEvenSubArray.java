package TLE_CP_31_SHEET.CP.CP_31_1100;

import java.util.Scanner;

public class FunWithEvenSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            int arr[] = new int[n];
            boolean bt =true;
            for(int i=0; i<n; i++){
                arr[i]= sc.nextInt();
            }
            int m =arr[0];
            for(int i=0; i<n; i++){
                if(m!=arr[i]){
                    bt=false;
                }
            }
            if(bt){
                System.out.println(0);
                continue;
            }
            int i= n-1;
            m=arr[n-1];
            int cnt=0;
            int ans=0;
            while(i>=0){
                if(arr[i]==m){
                    cnt++;
                }
                else{
                    break;
                }
                i--;
            }
            while(i>=0){
                if(arr[i]==m) {
                    i--;
                    cnt++;
                }
                else{
                    ans++;
                    i-=cnt;
                    cnt*=2;
                }
            }
            System.out.println(ans);
        }
    }
}
