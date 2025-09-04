package TLE_CP_31_SHEET.CP.CP_31_1200;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeActivities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long a[][] = new long[n][2];
            long b[][] = new long[n][2];
            long c[][] = new long[n][2];
            for(int i=0; i<n; i++){
                a[i][0]= sc.nextLong();
                a[i][1]=i;
            }
            for(int i=0; i<n; i++){
                b[i][0]= sc.nextLong();
                b[i][1]=i;
            }
            for(int i=0; i<n; i++){
                c[i][0]= sc.nextLong();
                c[i][1]=i;
            }
            Arrays.sort(a, (p, q) -> Long.compare(q[0], p[0]));
            Arrays.sort(b, (p, q) -> Long.compare(q[0], p[0]));
            Arrays.sort(c, (p, q) -> Long.compare(q[0], p[0]));
            long ans=0;
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    for(int k =0; k<3; k++){
                        if(a[i][1]!=b[j][1]&&b[j][1]!=c[k][1]&&c[k][1]!=a[i][1]){
                            ans=Math.max(a[i][0]+b[j][0]+c[k][0],ans);
                        }
                    }
                }
            }
            System.out.println(ans);

        }
    }
}
