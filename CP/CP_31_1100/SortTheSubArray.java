package TLE_CP_31_SHEET.CP.CP_31_1100;

import java.util.Scanner;

public class SortTheSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            for(int i=0; i<n; i++){
                a[i]=sc.nextInt();
            }
            for(int i=0; i<n; i++){
                b[i]=sc.nextInt();
            }
            int i=0;
            int j=0;
            for(int k=0; k<n; k++){
                if(a[k]!=b[k]){
                    i=k+1;
                    break;
                }
            }
            for(int k=n-1; k>=0; k--){
                if(k>i-1){
                    if(a[k]!=b[k]){
                        j=k+1;
                        break;
                    }
                }
            }
            if(i==0&&j==0){
                System.out.println(1+" "+1);
                continue;
            }
            int cnt=0;
            for(int k=i-2; k>=0; k--){
                if(b[k]<=b[k+1]){
                    cnt++;
                }
                else{
                    break;
                }
            }
            i-=cnt;
            cnt=0;
            for(int k=j; k<n; k++){
                if(b[k]>=b[k-1]){
                    cnt++;
                }
                else{
                    break;
                }
            }
            j+=cnt;
            System.out.println(i+" "+j);
        }
    }
}
