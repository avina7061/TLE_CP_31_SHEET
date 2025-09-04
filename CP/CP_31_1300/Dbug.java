package TLE_CP_31_SHEET.CP.CP_31_1300;

import java.util.ArrayList;
import java.util.Scanner;

public class Dbug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            ArrayList<Integer>list = new ArrayList<>();
            for(int i=0; i<n; i++){
                list.add(sc.nextInt());
            }
            int ans=0;
            for(int i=1; i<=n; i++){
                int ind=0;
                while(list.get(ind)!=i)ind++;

                int left =ind;
                int right= Math.max((list.size() - (ind + 1)), 0);
//                System.out.println("left "+left+" right "+right);
                if(left<right){
                    ans+=left;
                }
                else{
                    ans+=right;
                }
                list.remove(list.get(ind));
//                for(int num: list){
//                    System.out.print(num+" ");
//                }
//                System.out.println();
            }
            System.out.println(ans);
        }
    }
}
