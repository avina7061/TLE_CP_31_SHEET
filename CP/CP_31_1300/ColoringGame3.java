package TLE_CP_31_SHEET.CP.CP_31_1300;

import java.util.Arrays;
import java.util.Scanner;

public class ColoringGame3 {
    static int lowerBound(int[] arr, int from, int to, int key) {
        int low = from, high = to;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] < key) low = mid + 1;
            else high = mid;
        }
        return low;
    }

    static int upperBound(int[] arr, int from, int to, int key) {
        int low = from, high = to;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= key) low = mid + 1;
            else high = mid;
        }
        return low;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i]= sc.nextInt();
            }
            Arrays.sort(arr);
            long cnt=0;
            for(int i=0; i<n; i++){
                for(int j=i+1; j<n; j++){
                    int val1=arr[i]+arr[j];
                    int val2=arr[n-1]-val1;
                    int ub =upperBound(arr,j+1,n,val2);
                    int lb =lowerBound(arr,j+1,n,val1);
                    if(lb>ub){
                        cnt+=(lb-ub);
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
