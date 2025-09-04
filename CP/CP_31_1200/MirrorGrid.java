package TLE_CP_31_SHEET.CP.CP_31_1200;

import java.util.Scanner;

public class MirrorGrid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            char arr[][]= new char[n][n];
            for(int i=0; i<n; i++){
                String s =sc.next();
                arr[i]=s.toCharArray();
            }
            int ans=0;
            for(int i=0; i<n/2; i++){
               for(int j=i; j<n-i-1; j++){
                   char a =arr[i][j];
                   char b = arr[n-j-1][i];//for last row of each diagonal subSquare
                   char c =arr[n-i-1][n-j-1];
                   char d =arr[j][n-i-1];//for last column of each diagonal subSquare
                   int cnt=0;
                   if(a=='1')cnt++;
                   if(b=='1')cnt++;
                   if(c=='1')cnt++;
                   if(d=='1')cnt++;
                   if(cnt<=2){
                       ans+=cnt;
                   }
                   else{
                       ans+=(4-cnt);
                   }

               }
            }
            System.out.println(ans);
        }
    }
}
