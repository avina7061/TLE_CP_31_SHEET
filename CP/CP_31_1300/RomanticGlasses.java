package TLE_CP_31_SHEET.CP.CP_31_1300;

import java.util.HashSet;
import java.util.Scanner;

public class RomanticGlasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long arr[] = new long[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextLong();
            }

            int lnB = n / 2;
            int lnA = n - lnB;
            long first[] = new long[lnA];
            long sec[] = new long[lnB];

            int ind1 = 0, ind2 = 0;

            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    if (ind1 == 0) first[ind1] = arr[i];
                    else first[ind1] = first[ind1 - 1] + arr[i];
                    ind1++;
                } else {
                    if (ind2 == 0) sec[ind2] = arr[i];
                    else sec[ind2] = sec[ind2 - 1] + arr[i];
                    ind2++;
                }
            }

            HashSet<Long> set = new HashSet<>();
            set.add(0L);
            set.add(arr[0]);
            boolean flag = true;

            for (int i = 2; i <= n; i++) {
                int ind = i / 2;

                long val;
                if (i % 2 == 0) {
                    if (ind - 1 < first.length && ind - 1 < sec.length) {
                        val = first[ind - 1] - sec[ind - 1];
                    } else continue;
                } else {
                    if (ind < first.length && ind - 1 >= 0 && ind - 1 < sec.length) {
                        val = first[ind] - sec[ind - 1];
                    } else continue;
                }

                if (set.contains(val)) {
                    System.out.println("Yes");
                    flag = false;
                    break;
                }
                set.add(val);
            }

            if (flag) System.out.println("No");
        }
    }
}
