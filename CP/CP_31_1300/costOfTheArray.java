package TLE_CP_31_SHEET.CP.CP_31_1300;

import java.util.Scanner;

public class costOfTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k= sc.nextInt();
            long arr[] = new long[n];
            for(int i=0; i<n; i++){
                arr[i]= sc.nextLong();
            }
            long ans=Long.MIN_VALUE;
            long cnt=1;
            boolean bt =true;
            if(k==n){
                for(int i=1; i<n; i+=2){
                    if(arr[i]!=cnt){
                        bt=false;
                        ans=cnt;
                        break;
                    }
                    cnt++;
                }
                  if(ans==Long.MIN_VALUE){
                    System.out.println(cnt);
                    continue;
                }
                  else{
                      System.out.println(ans);
                      continue;
                  }
            }

            long ansMax=2;
               int val=n-k+2;
               for(int i=1; i<val; i++){
                   if(arr[i]!=1){
                       ansMax=Math.min(1,ansMax);
                       break;
                   }
               }
                System.out.println(ansMax);
            }

    }
}
