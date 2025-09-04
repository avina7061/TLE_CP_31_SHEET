package TLE_CP_31_SHEET.CP.CP_31_1300;

import java.util.ArrayList;
import java.util.Scanner;

public class mostsociallyDistanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
            ArrayList<Integer>list = new ArrayList<>();
            list.add(arr[0]);
            int i=1;
            while(i<n){
                if(arr[i]>arr[i-1]){
                    while(i<n&&arr[i]>arr[i-1]){
                        i++;
                    }
                    list.add(arr[i-1]);

                    continue;
                }
                else{
                    while(i<n&&arr[i]<arr[i-1]){
                        i++;
                    }
                    list.add(arr[i-1]);

                    continue;
                }

            }
//            list.add(arr[n-1]);
            System.out.println(list.size());
            for(int k: list){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
