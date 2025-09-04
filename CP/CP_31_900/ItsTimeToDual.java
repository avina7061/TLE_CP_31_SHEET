package TLE_CP_31_SHEET.CP.CP_31_900;

import java.util.Scanner;

public class ItsTimeToDual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i]= sc.nextInt();
            }
            int count=1;
            int cnt1=0;
            for(int i=1; i<n; i++){
                if(arr[i]==0&&arr[i-1]==0){
                    count++;
                }
            }
            if(count>=2){
                System.out.println("Yes");
                continue;
            }
            for(int i=0; i<n; i++){
                if(arr[i]==1){
                    cnt1++;
                }
            }
            if(cnt1==n){
                System.out.println("Yes");
                continue;
            }
            System.out.println("No");
        }
    }
}
