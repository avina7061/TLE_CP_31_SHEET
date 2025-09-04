package TLE_CP_31_SHEET.CP.CP_31_1200;

import java.util.Scanner;

public class ContrastValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int  n = sc.nextInt();
            long arr[] = new long[n];
            for(int i=0; i<n; i++){
                arr[i]= sc.nextLong();
            }
            boolean om =true;
            long val= arr[0];
            for(long i: arr){
                if(i!=val){
                    om=false;
                    break;
                }
            }
            if(om||n==1){
                System.out.println(1);
                continue;
            }
            boolean dev =true;
            int cnt=0;
            for(int i=1; i<n; i++){
                if(arr[i]>arr[i-1]){
                    if(dev){
                        cnt++;
                        dev=false;
                    }
                }
                else if(arr[i]==arr[i-1]){
                    continue;
                }
                else{
                    dev=true;
                }
            }

            dev=true;
            for(int i=1; i<n; i++){
                if(arr[i]<arr[i-1]){
                    if(dev){
                        cnt++;
                        dev=false;
                    }
                }
                else if(arr[i]==arr[i-1]){
                    continue;
                }
                else{
                    dev=true;
                }
            }

            System.out.println(cnt+1);
        }
    }
}
