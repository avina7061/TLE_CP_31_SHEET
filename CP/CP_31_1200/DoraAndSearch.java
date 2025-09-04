package TLE_CP_31_SHEET.CP.CP_31_1200;

import java.util.Scanner;

public class DoraAndSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
            int left=1;
            int right=n;
            int i=0;
            int j=n-1;

            while(i<j){
                boolean a=false;
                if(arr[i]==left||arr[i]==right){
                    if(arr[i]==left)left++;
                    else right--;
                    a=true;
                    i++;
                }

                if(arr[j]==left||arr[j]==right){
                    if(arr[j]==left)left++;
                    else right--;
                    a=true;
                    j--;
                }
                if(!a){
                    break;
                }
            }
            if(i>=j){
                System.out.println(-1);
            }
            else{
                System.out.println((i+1)+" "+(j+1));
            }
        }
    }
}
