package TLE_CP_31_SHEET.CP.CP_31_900;

import java.util.Scanner;

public class NITDestroyesTheUniverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i]= sc.nextInt();
            }
            int cnt=0;
            int sum=0;
            for(int i=0; i<n; i++) {
                if (cnt == 0 && arr[i] != 0) {
                    cnt++;
                    sum++;
                } else if(arr[i]==0) {
                    cnt = 0;
                }
            }
            System.out.println((sum<=1)?sum : 2);
        }
    }
}
