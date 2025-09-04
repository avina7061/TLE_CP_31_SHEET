package TLE_CP_31_SHEET.CP.EXTRA_SET;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class penchikanddesertrabbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            int nums[] = new int[n];
            for(int i=0; i<n; i++){
                nums[i]=sc.nextInt();
            }
            int[] pre = new int[n];
            pre[0] = nums[0];
            for (int i = 1; i < n; i++) {
                pre[i] = Math.max(pre[i - 1], nums[i]);
            }

            int[] nextSmaller = new int[n];
            Arrays.fill(nextSmaller, -1);
            Stack<Integer> st = new Stack<>();

            for (int i = n - 1; i >= 0; i--) {
                while (!st.isEmpty() && nums[st.peek()] >= pre[i]) {
                    st.pop();
                }
                if (!st.isEmpty()) {
                    nextSmaller[i] = st.peek();
                }
                st.push(i);
            }


            int[] arr = new int[n];
            for (int i = n - 1; i >= 0; i--) {
                int max = pre[i];
                int ind = nextSmaller[i];
                if (ind != -1) {
                    max = Math.max(max, pre[ind]);
                    arr[i] = Math.max(arr[ind], max);
                } else {
                    arr[i] = max;
                }
            }
            for(int i: arr){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
