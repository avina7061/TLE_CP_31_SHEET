package TLE_CP_31_SHEET.CP.CP_31_800;

import java.util.Scanner;

public class OneAndTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[]= new int[n];
            int sum=1;
            int cnt2=0;
            for(int i=0; i<n; i++){
                arr[i]= sc.nextInt();
                sum*=arr[i];
                if(arr[i]==2){
                    cnt2++;
                }
            }
            if(cnt2%2!=0) System.out.println(-1);
            else{
                if(cnt2==0) System.out.println(1);
                else{
                    int cn=0;
                    for(int i=0; i<n; i++){
                        if(arr[i]==2)cn++;
                        if(cn==cnt2/2){
                            System.out.println(i+1);
                            break;
                        }
                    }
                }
            }

        }
    }
}
