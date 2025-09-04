package TLE_CP_31_SHEET.CP.CP_31_900;

import java.util.Arrays;
import java.util.Scanner;

public class JohnsCardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int cnt=1;
            boolean bt =true;
          int acc[] = new int[m*n+1];
            for(int i=0; i<n; i++){
                int arr[]= new int[m];
                int min=Integer.MAX_VALUE;
                for(int j=0; j<m; j++){
                    arr[j]= sc.nextInt();
                    min=Math.min(min,arr[j]);
                }
                acc[min+1]=cnt;
                cnt++;
                Arrays.sort(arr);
                if(n>1){
                    for(int k=1; k<m; k++){
                        if(arr[k]-arr[k-1]==1){
                            bt=false;
                            break;
                        }
                    }
                }
            }
            if(bt){
                for(int i=0; i<m*n+1; i++){
                    if(acc[i]!=0){
                        System.out.print(acc[i]+" ");
                    }
                }
                System.out.println();
            }
            else{
                System.out.println(-1);
            }

        }
    }
}
