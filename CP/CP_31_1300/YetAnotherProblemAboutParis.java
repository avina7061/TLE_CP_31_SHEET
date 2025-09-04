package TLE_CP_31_SHEET.CP.CP_31_1300;

import java.util.Arrays;
import java.util.Scanner;

public class YetAnotherProblemAboutParis {
    static int upperBound(long[][] arr, int from, int to, long key) {
        int low = from, high = to;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid][1] <= key) low = mid + 1;
            else high = mid;
        }
        return low;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long arr[] = new long[n];
            int cn=0;
            for(int i=0; i<n; i++){
                arr[i]=sc.nextLong();
                if(i+1>arr[i]){
                    cn++;
                }
            }
            int ind=0;
            long dps[][] =new long[cn][2];
            for(int i=0; i<n; i++){
                if(i+1>arr[i]){
                    dps[ind][0]=i+1;
                    dps[ind][1]=arr[i];
                    ind++;
                }
            }
            Arrays.sort(dps, (a, b) -> {
                if (a[1] != b[1]) {
                    return Long.compare(a[1], b[1]);
                } else {
                    return Long.compare(a[0], b[0]);
                }
            });
            long ans=0;
            for(int i=0; i<cn; i++){
                long val = dps[i][0];
                int found= upperBound(dps,i+1,cn,val);
                ans+=(cn-found);
            }
            System.out.println(ans);
        }
    }
}
