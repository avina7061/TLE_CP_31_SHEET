package TLE_CP_31_SHEET.CP.CP_31_1200;

import java.util.Arrays;
import java.util.Scanner;

public class FriendsAndTheResturant {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int x[] = new int[n];
            for(int i=0; i<n; i++) {
                x[i] = sc.nextInt();
            }
            int y[] = new int[n];
            for(int i=0; i<n; i++) {
                y[i] = sc.nextInt();
            }

            int newArr[] = new int[n];

            for(int i=0; i<n; i++){
                newArr[i]=y[i]-x[i];
            }
            Arrays.sort(newArr);
            int left = 0, right = n-1;
            int res = 0;
            while(left < right) {
                if(newArr[left] + newArr[right] >= 0) {
                    res++;
                    left++;
                    right--;
                } else {
                    left++;
                }
            }
            System.out.println(res);
        }
    }
}