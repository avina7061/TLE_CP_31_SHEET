package TLE_CP_31_SHEET.CP.CP_31_1100;

import java.util.Arrays;
import java.util.Scanner;

public class CollectingGame3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[][] arr = new long[n][2];

            for (int i = 0; i < n; i++) {
                arr[i][0] = sc.nextLong();
                arr[i][1] = i;
            }

            Arrays.sort(arr, (a, b) -> Long.compare(a[0], b[0]));

            long pre[] = new long[n];
            pre[0]=arr[0][0];
            int ans[] = new int[n];
            for(int i=1; i<n; i++){
                pre[i]=pre[i-1]+arr[i][0];
            }
            for (int i = 0; i < n; i++) {
                int j = i;
                int found = 0;
                int ind = 0;

                while (j < n) {
                    long target = pre[j] ;
                    int idx = upperBound(arr, target);
                    idx--;
//                    System.out.println("idx"+idx);


                    found += (idx - ind);
//                    System.out.println("found"+found);
                    if (idx == j) {break;}
                    j = idx;
                    ind = j;


                }
//                System.out.println("original"+found);
                int originalIndex = (int) arr[i][1];
                ans[originalIndex] = found ;
            }


            for(int i:ans){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    private static int upperBound(long[][] arr, long val) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid][0] <= val) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
