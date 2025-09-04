package TLE_CP_31_SHEET.CP.CP_31_900;

import java.util.Scanner;
public class LongestDivisorsInterval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long storeLeft=0;
            long storeRight=0;
            long left=-1;
            long right=-1;
            long max =Integer.MIN_VALUE;
            for(long i=1; i<=10000; i++){
                if(n%i==0){
                    if(left==-1){
                        left=i;
                    }
                    right=i;
                }
                else{
                    if(right-left+1>max){
                        max=right-left+1;
                        storeLeft=left;
                        storeRight=right;
                    }
                    left=-1;
                    right=-1;
                }
            }
            System.out.println(storeRight-storeLeft+1);


        }
    }
}