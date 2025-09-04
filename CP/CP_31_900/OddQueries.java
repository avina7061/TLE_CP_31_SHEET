package TLE_CP_31_SHEET.CP.CP_31_900;

import java.util.Scanner;

public class OddQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int q = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i]= sc.nextInt();
            }

            int prefixSum[] = new int[n];
            prefixSum[0]=arr[0];
            for(int i=1; i<n; i++){
                prefixSum[i]=arr[i]+prefixSum[i-1];
            }
            while (q-- > 0) {
                int l =sc.nextInt();
                int r = sc.nextInt();
                int k= sc.nextInt();
                int left=0;
                if(l-2>=0){
                    left=prefixSum[l-2];
                }
                if((left+(prefixSum[n-1]-prefixSum[r-1])+((r-l)+1)*k)%2!=0){

                    System.out.println("Yes");
                }
                else System.out.println("No");

            }
        }
    }
}
