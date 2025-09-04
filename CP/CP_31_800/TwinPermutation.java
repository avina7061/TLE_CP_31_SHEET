package TLE_CP_31_SHEET.CP.CP_31_800;

import java.util.Arrays;
import java.util.Scanner;

public class TwinPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
       while(t-->0){
           int n = sc.nextInt();
           int arr[] = new int[n];
           boolean b = true;
           int min= Integer.MIN_VALUE;

           for(int i=0; i<n; i++){
               arr[i]= sc.nextInt();
               if(arr[i]>=min){
                   min=arr[i];
               }
               else{
                   b =false;
               }
           }
           int temp[]= Arrays.copyOf(arr,n);
           int fq[]= new int[n];
           Arrays.sort(temp);
           if(b){
               for(int num: arr){
                   System.out.print(num+" ");
               }
           }

           else{
               for(int i=0; i<n; i++){
                   fq[i]=temp[(n-arr[i])];

               }

           }
           for(int num: fq){
               if(num!=0){
                   System.out.print(num+" ");
               }
           }
           System.out.println();
       }
    }
}
