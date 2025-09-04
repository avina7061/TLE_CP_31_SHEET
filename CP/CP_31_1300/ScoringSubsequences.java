package TLE_CP_31_SHEET.CP.CP_31_1300;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ScoringSubsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
                for(int i=0; i<n; i++){
                    arr[i]=sc.nextInt();
                }
            ArrayList<Integer>list= new ArrayList<>();
            for(int i=n-1; i>=0; i--){
                int left=0;
                int right= i;
                while(left<=right){
                    int mid=(left+right)/2;
                    int val = i-mid+1;
//                    System.out.println("arr[mid] "+arr[mid]);
//                    System.out.println("val "+val);
//                    System.out.println("mid "+mid);
//                    System.out.println("left "+left);
//                    System.out.println("right "+right);
                    if(arr[mid]/val>=1){
                        right=mid-1;
                    }
                    else{
                        left=mid+1;
                    }
                }
//                System.out.println("break");
                list.add(i-left+1);
            }
            Collections.reverse(list);
            for(int i: list){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
