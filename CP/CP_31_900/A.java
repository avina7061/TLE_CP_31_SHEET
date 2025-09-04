package TLE_CP_31_SHEET.CP.CP_31_900;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr [] = new int[n];
            int sum=0;
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
                if(arr[i]==0){
                    sum+=1;
                }
                else sum+=arr[i];
            }
            System.out.println(sum);
        }
    }
}
