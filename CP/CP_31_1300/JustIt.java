package TLE_CP_31_SHEET.CP.CP_31_1300;

import java.util.Scanner;

public class JustIt {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long arr[] = new long[n];
            long damm=0;
            for(int i=0; i<n; i++){
                arr[i]=sc.nextLong();
                damm+=arr[i];
            }
            long mx= Long.MIN_VALUE;
            long sum=arr[0];
            mx=Math.max(mx,sum);
            for(int i=1; i<n-1; i++){
                if(sum+arr[i]>=arr[i]){
                    sum+=arr[i];
                }
                else{
                    sum=arr[i];
                }
//                System.out.println(sum);
                mx=Math.max(sum,mx);
            }
            mx=Math.max(mx,sum);
//            System.out.println("max1 "+mx);

            sum=arr[1];
            mx=Math.max(mx,sum);
            for(int i=2; i<n; i++){
                if(sum+arr[i]>=arr[i]){
                    sum+=arr[i];
                }
                else{
                    sum=arr[i];
                }
                mx=Math.max(mx,sum);
            }
            mx=Math.max(mx,sum);
//            System.out.println("max2 "+mx);

            if(damm>mx){
                System.out.println("Yes");
            }
            else System.out.println("No");
        }
    }
}
