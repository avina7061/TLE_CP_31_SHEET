package TLE_CP_31_SHEET.CP.CP_31_1200;

import java.util.Arrays;
import java.util.Scanner;

public class playingAcasino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[][] = new int[m][n];
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    arr[j][i]=sc.nextInt();
                }
            }
long ans=0;
            for(int i=0; i<m; i++){
                Arrays.sort(arr[i]);
                long sum=0;
                for(int j=0; j<n; j++){
                    ans+=((long) j *arr[i][j])-sum;
                    sum+=arr[i][j];
                }
            }
            System.out.println(ans);
        }
    }
}
