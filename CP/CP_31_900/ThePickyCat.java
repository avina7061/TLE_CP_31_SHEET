package TLE_CP_31_SHEET.CP.CP_31_900;

import java.util.Scanner;
public class ThePickyCat{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int times=sc.nextInt();
        while(times-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int c=1;
            int t=Math.abs(a[0]);
            for(int i=1;i<n;i++){
                if(Math.abs(a[i])>t){
                    c++;
                }
            }
            if(c>=(n+1)/2){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
