package TLE_CP_31_SHEET.CP.CP_31_900;

import java.util.Scanner;

public class MakeItIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long arr[] = new long[n];
            for(int i=0; i<n; i++){
                arr[i]= sc.nextLong();
            }
            int cnt=0;
            boolean b=false;
            for(int i=n-2; i>=0; i--){
                while(arr[i]>=arr[i+1]){
                    arr[i]/=2;
                    cnt++;
                    if(arr[i]==0&&i!=0||(arr[i]==0&&arr[i+1]==0)){
                        b=true;
                        break;
                    }
                }
                if(b)break;
            }
            if(b) System.out.println(-1);
           else System.out.println(cnt);
        }
    }
}
