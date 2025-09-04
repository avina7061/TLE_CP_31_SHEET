package TLE_CP_31_SHEET.CP.CP_31_1100;

import java.util.Scanner;

public class BuildingAnAquarium {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
           long max=Long.MIN_VALUE;
            int n = sc.nextInt();
            long x= sc.nextLong();
            long arr[] = new long[n];
            long min=Long.MAX_VALUE;
            for(int i=0; i<n; i++){
                arr[i]= sc.nextLong();
                max=Math.max(max,arr[i]);
                min=Math.min(min,arr[i]);
            }
            long ans=0;
            long i=1;
            long j=x+max;
            long maxi=Long.MIN_VALUE;
            while(i<=j){
                long mid=(i+j)/2;
//                System.out.println("mid"+mid);
                long sum=0;
                for(int k=0; k<n; k++){
                  if(arr[k]<mid){
                      sum+=(mid-arr[k]);
                  }
                }
                 if(sum>x){
                    j=mid-1;
                }
                else{
                    if(maxi<sum){
                        maxi=sum;
                        ans=mid;
                    }
                    i=mid+1;
                }

            }
            System.out.println(Math.max(min,ans));
        }
    }
}
