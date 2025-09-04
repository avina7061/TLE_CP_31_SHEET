package TLE_CP_31_SHEET.CP.CP_31_1300;

import java.util.Arrays;
import java.util.Scanner;

public class StrangeBirthDayParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k[] = new int[n];
            for(int i=0; i<n; i++){
                k[i]=sc.nextInt();
            }
            long c[] = new long[m];
            for(int i=0; i<m; i++){
                c[i]=sc.nextLong();
            }
            int ind=0;
            Arrays.sort(k);
            long sum=0;
            for(int i=n-1; i>=0; i--){
                if(ind+1<=k[i]){
                    sum+=c[ind];
                    ind++;
                }
                else{
                    sum+=c[k[i]-1];
                }
            }
            System.out.println(sum);
        }
    }
}
