package TLE_CP_31_SHEET.CP.CP_31_1200;

import java.util.ArrayList;
import java.util.Scanner;

public class ServalAndFinalMex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            int arr[]= new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
            int cnt=0;
            ArrayList<int []> list = new ArrayList<>();
            if(arr[0]==0||arr[1]==0){
                cnt++;
                int a[]={1,2};
                list.add(a);
            }
            int i=2;
            int ind=-1;
            while(i<n){
                if(arr[i]==0&&i!=n-1){
                    int a[]={i+1-cnt,i+2-cnt};
                    cnt++;
                    list.add(a);
                    ind=i;
                    i+=2;
                }
               else i++;
            }
//            System.out.println(ind);
            if(ind!=n-2){
               if(arr[n-1]==0){
                   int b[] = {n-1-cnt,n-cnt};
                   cnt++;
                   list.add(b);
               }
            }

            int b[]= {1,n-cnt};
            list.add(b);
            System.out.println(list.size());
            for(int j[]: list){
                System.out.println(j[0]+" "+j[1]);
            }
        }
    }
}
