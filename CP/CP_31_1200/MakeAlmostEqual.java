package TLE_CP_31_SHEET.CP.CP_31_1200;

import java.util.HashSet;
import java.util.Scanner;

public class MakeAlmostEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long arr[] = new long[n];
            for(int i=0; i<n; i++){
                arr[i]= sc.nextLong();
            }
            long div=2;
            while(true){
                HashSet<Long>set = new HashSet<>();
                for(int i=0; i<n; i++){
                    set.add(arr[i]%div);
                }
                if(set.size()==2){
                    System.out.println(div);
                    break;
                }
                else{
                    div*=2;
                }
            }
        }
    }
}
