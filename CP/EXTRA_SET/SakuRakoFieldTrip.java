package TLE_CP_31_SHEET.CP.EXTRA_SET;

import java.util.Scanner;

public class SakuRakoFieldTrip {
    public static void swap(int arr[],int ind1, int ind2){
        int temp=arr[ind2];
        arr[ind2]=arr[ind1];
        arr[ind1]=temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }

            for(int i=1; i<n/2; i++){
                if(arr[i-1]==arr[i]||arr[n-i]==arr[n-i-1]){
                          swap(arr,i,n-i-1);
                }
            }

            int cnt=0;
            int i=1;
            while(i<n){
                if(arr[i-1]==arr[i]){
                        while(i<n&&arr[i]==arr[i-1]){
                            cnt++;
                            i++;
                        }
                        continue;
                }
            i++;
            }
            System.out.println(cnt);
        }
    }
}
