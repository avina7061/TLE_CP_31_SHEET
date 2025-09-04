package TLE_CP_31_SHEET.CP.CP_31_800;

import java.util.Scanner;

public class UnitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            int cnt1=0;
            int cnt2=0;
            int opr=0;
            for(int i=0; i<n; i++){
                arr[i]= sc.nextInt();
                if(arr[i]==1){
                    cnt1++;
                }
                else{
                    cnt2++;
                }
            }
            while(cnt2>cnt1){
                opr++;
                cnt2--;
                cnt1++;
            }
            if(cnt2%2!=0){
                opr++;
                cnt2--;
            }
            System.out.println(opr);
        }
    }
}
