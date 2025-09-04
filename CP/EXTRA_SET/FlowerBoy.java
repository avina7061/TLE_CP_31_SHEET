package TLE_CP_31_SHEET.CP.EXTRA_SET;

import java.util.Arrays;
import java.util.Scanner;
public class FlowerBoy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            long a[]=new long[n];
            long b[]=new long[m];
            for(int i=0; i<n; i++){
                a[i]=sc.nextLong();
            }
            for(int i=0; i<m; i++){
                b[i]=sc.nextLong();
            }
            long pre[]=new long[m];
            Arrays.fill(pre,Long.MAX_VALUE);
            long suff[]=new long[m];
            Arrays.fill(suff,Long.MIN_VALUE);

            int i=0, j=0;

            int ind=0;
            for(i=0; i<n; i++){
                if(ind<m && a[i]>=b[ind]){
                    pre[ind]=i;
                    ind++;
                }
            }
             if(pre[m-1]!=Long.MAX_VALUE){
                 System.out.println(0);
                 continue;
             }
             if(m==1){
                 System.out.println(b[0]);
                 continue;
             }
            ind=m-1;
            for(i=n-1; i>=0; i--){
                if(ind>=0 && a[i]>=b[ind]){
                    suff[ind]=i;
                    ind--;
                }
            }

            long ans=Long.MAX_VALUE;
            for(i=0; i<m; i++){
                if(i==0){
                    if(i+1<m && suff[i+1]!=Long.MIN_VALUE){
                        ans=Math.min(ans,b[i]);
                    }
                    continue;
                }
                if(i==m-1){
                    if(m-2>=0 && pre[m-2]!=Long.MAX_VALUE){
                        ans=Math.min(ans,b[i]);
                    }
                    continue;
                }
                if(pre[i-1]<suff[i+1]){
                    ans=Math.min(ans,b[i]);
                }
            }
            System.out.println((ans==Long.MAX_VALUE)?-1:ans);
        }
    }
}
