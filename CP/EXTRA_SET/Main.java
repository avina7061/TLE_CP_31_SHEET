package TLE_CP_31_SHEET.CP.EXTRA_SET;

import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=1;i<n/2;i++){
                if(arr[i-1]==arr[i] || arr[n-i]==arr[n-i-1]){
                    int temp=arr[i];
                    arr[i]=arr[n-i-1];
                    arr[n-i-1]=temp;
                }
            }
            int ans=0;
            for(int i=1;i<n;i++){
                if(arr[i-1]==arr[i]) ans++;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
