package TLE_CP_31_SHEET.CP.CP_31_1100;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayFix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr [] = new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
            boolean b =true;
            int val=-1;
            for(int i:arr){
                 if(i>=val){
                     val=i;
                 }
                 else{
                     b=false;
                     break;
                 }
            }
            if(b){
                System.out.println("Yes");
            }
            else{
                ArrayList<Integer>list = new ArrayList<>();
                list.add(arr[n-1]);
                int v=arr[n-1];
                for(int i=n-2; i>=0; i--){
                    if(v>=arr[i]){
                        list.add(arr[i]);
                        v=arr[i];
//                        System.out.println(v+" a");
                    }
                    else{
                        int num =arr[i];
                        while(num>0){
                            int x = num%10;
                            num/=10;
                            list.add(x);
                            v=x;
//                            System.out.println(x+" b");
                        }
                    }
                }
                int z=500;
                boolean om=true;
                for(int i: list){
                    if(z<i){
                        om=false;
                        break;
                    }
                    z=i;
                }
                System.out.println((om)?"Yes":"No");
            }
        }
    }
}
