package TLE_CP_31_SHEET.CP.CP_31_1100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class YetAnotherCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>list = new ArrayList<>();
            int n = sc.nextInt();
            int q=sc.nextInt();

            int brr[] = new int[q];
            for(int i=0; i<n; i++){
                list.add(sc.nextInt());
            }
            for(int i=0; i<q; i++){
                brr[i]=sc.nextInt();
            }
            int cnt=0;
        for(int i: brr){
           if(cnt<q){
               int ind=list.indexOf(i);
               System.out.print((ind+1)+" ");
               Collections.rotate(list.subList(0,ind+1),1);
           }
           cnt++;
        }
        System.out.println();
    }
}
