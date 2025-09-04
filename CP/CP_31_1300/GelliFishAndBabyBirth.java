package TLE_CP_31_SHEET.CP.CP_31_1300;

import java.util.Scanner;

public class GelliFishAndBabyBirth {

    static final int MOD = 998244353;

    static long powerOfTwo(int exp) {
        long result = 1;
        long base = 2;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exp >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int max1[][] = new int[n][2];
            int max2[][] = new int[n][2];
            int min = -1;
            int p[] = new int[n];
            for(int i=0;i<n; i++){
                p[i]= sc.nextInt();
                if(min < p[i]){
                    min = p[i];
                    max1[i][0] = i;
                    max1[i][1] = p[i];
                } else {
                    max1[i][0] = max1[i-1][0];
                    max1[i][1] = max1[i-1][1];
                }
            }

            min = -1;
            int q[] = new int[n];
            for(int i=0;i<n; i++){
                q[i]= sc.nextInt();
                if(min < q[i]){
                    min = q[i];
                    max2[i][0] = i;
                    max2[i][1] = q[i];
                } else {
                    max2[i][0] = max2[i-1][0];
                    max2[i][1] = max2[i-1][1];
                }
            }

            int ans[] = new int[n];
            for(int i=0; i<n; i++){
                if(max1[i][1] > max2[i][1]){
                    int find = max1[i][0];
                    int sind = i - max1[i][0];
                    long a = powerOfTwo(p[find]);
                    long b = powerOfTwo(q[sind]);
                    ans[i] = (int)((a + b) % MOD);
                } else if(max1[i][1] < max2[i][1]){
                    int find = max2[i][0];
                    int sind = i - max2[i][0];
                    long a = powerOfTwo(q[find]);
                    long b = powerOfTwo(p[sind]);
                    ans[i] = (int)((a + b) % MOD);
                } else {
                    int ind1 = max1[i][0];
                    int ind2 = max2[i][0];
                    if(q[i-ind1] > p[i-ind2]){
                        long a = powerOfTwo(p[ind1]);
                        long b = powerOfTwo(q[i-ind1]);
                        ans[i] = (int)((a + b) % MOD);
                    } else {
                        long a = powerOfTwo(q[ind2]);
                        long b = powerOfTwo(p[i-ind2]);
                        ans[i] = (int)((a + b) % MOD);
                    }
                }
            }

            for(int i: ans){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
