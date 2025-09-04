package TLE_CP_31_SHEET.CP.CP_31_800;

import java.util.Arrays;
import java.util.Scanner;

public class MakeItBeautiful {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[]= new int[n];
            int sum=0;
            boolean b = true;
            boolean no= true;
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
                if (sum == arr[i]) {
                    b = false;
                }

                sum += arr[i];
            }
            for(int i=0; i<n; i++){
                if(i<n-1&&arr[i]!=arr[i+1]){
                    no =false;
                }
            }
            if(no){
                System.out.println("No");
            }
            else{
                int temp[]= Arrays.copyOf(arr,n);
                Arrays.sort(temp);
                temp[0]=temp[n-1];
                for(int i=1; i<n; i++){
                    temp[i]=arr[i-1];
                }
                System.out.println("Yes");
                for(int num: temp){
                    System.out.print(num+" ");
                }
                System.out.println();
            }



        }
    }
}
