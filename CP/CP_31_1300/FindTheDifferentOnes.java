package TLE_CP_31_SHEET.CP.CP_31_1300;

import java.util.ArrayList;
import java.util.Scanner;

public class FindTheDifferentOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int q = sc.nextInt();
            ArrayList<int[]> list = new ArrayList<>();
            for (int i = 0; i < q; i++) {
                int acc[] = new int[2];
                acc[0] = sc.nextInt();
                acc[1] = sc.nextInt();
                list.add(acc);
            }
            int val = arr[0];
            ArrayList<int[]> tmp = new ArrayList<>();
            int a[] = new int[2];
            a[0] = 0;
            a[1] = 0;
            tmp.add(a);
            for (int i = 1; i < n; i++) {
                int[] prev = tmp.get(i - 1);

                int[] b = new int[2];
                b[0] = prev[0];
                b[1] = prev[1];

                if (arr[b[0]] == arr[i]) {
                    b[0] = i;
                } else if (arr[b[1]] == arr[i]) {
                    b[1] = i;
                } else {
                    if(b[0]<b[1]){
                        b[0]=i;
                    }
                    else{
                        b[1]=i;
                    }
                }

                tmp.add(b);
            }
           for(int i=0; i<list.size(); i++){
               int c[]= list.get(i);
               int l=c[0];
               int m=c[1];
               int d[]=tmp.get(m-1);
               int min=Integer.MAX_VALUE;
               int max=Integer.MIN_VALUE;
               int e = d[0];
               int p =d[1];
               min=Math.min(e,p);
               max=Math.max(e,p);
               if(arr[d[0]]==arr[d[1]]||min+1<l||max+1<l||min+1>m||max+1>m){

                   System.out.println(-1+" "+-1);
               }
               else{
                   System.out.println((min+1)+" "+(max+1));
               }
           }

        }
    }
}