package TLE_CP_31_SHEET.CP.CP_31_1100;

import java.util.HashSet;
import java.util.Scanner;

public class DejaVu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int q=sc.nextInt();
            long arr[] = new long[n];
            long brr[]= new long[q];
            for(int i=0; i<n; i++){
                arr[i]= sc.nextLong();
            }
            for(int i=0; i<q; i++){
                brr[i]= sc.nextLong();
            }
            HashSet<Long>set=new HashSet<>();
            for(int i=0; i<q; i++){
                if(!set.contains(brr[i])){
                    long div=(long) Math.pow(2,brr[i]);
                    long add=(long) Math.pow(2,brr[i]-1);
                    set.add(brr[i]);
                    for(int j=0; j<n; j++){
                        if(arr[j]%div==0){
                            arr[j]+=add;
                        }
                    }
                }
            }

            for(long i: arr){
                System.out.print(i+" ");
            }
            System.out.println();

        }
    }
}
