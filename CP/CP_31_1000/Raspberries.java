package TLE_CP_31_SHEET.CP.CP_31_1000;

import java.util.Scanner;

public class Raspberries {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int min = Integer.MAX_VALUE;

           boolean b =true;
             int cnt=0;
            for (int i = 0; i < n; i++) {
                if(arr[i]%k==0){
                    System.out.println(0);
                    b=false;
                    break;
                }
                if(arr[i]%2==0){
                    cnt++;
                }
                min = Math.min(min, k - (arr[i] % k));
            }

           if(b){
               if(k==4){
                   if(cnt>=2){
                       System.out.println(0);
                   }
                   else if(cnt==1){
                       System.out.println(1);
                   }

                   else{
                       if(min<2) System.out.println(min);
                       else System.out.println(2);
                   }
               }
               else System.out.println(min);
           }

        }
    }
}
