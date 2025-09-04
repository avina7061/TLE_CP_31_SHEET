package TLE_CP_31_SHEET.CP.CP_31_1100;

import java.util.Scanner;

public class RightLwftWrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
       while(t-->0){
           int n= sc.nextInt();
           int arr[] = new int[n];
           for(int i=0; i<n; i++){
               arr[i]= sc.nextInt();
           }
           String s = sc.next();
           long pre[] = new long[n];
           pre[0]=arr[0];
           for(int i=1; i<n; i++){
               pre[i]=pre[i-1]+arr[i];
           }
           int left=0;
           int right=n-1;
           long sum=0;
           while(left<right){
               if(s.charAt(left)=='L'&&s.charAt(right)=='R'){
                   long val=0;
                   if(left!=0){
                       val=pre[left-1];
                   }
                   sum+=pre[right]-val;
                   left++;
                   right--;
               }
               else if(s.charAt(left)!='L'&&s.charAt(right)!='R'){
                   left++;
                   right--;
               }
               else if(s.charAt(left)=='L'&&s.charAt(right)!='R'){
                   right--;
               }
               else if(s.charAt(left)!='L'&&s.charAt(right)=='R'){
                   left++;
               }
           }
           System.out.println(sum);
       }
    }
}
