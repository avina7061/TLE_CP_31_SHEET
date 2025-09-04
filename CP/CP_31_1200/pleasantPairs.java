package TLE_CP_31_SHEET.CP.CP_31_1200;

import java.util.Scanner;

public class pleasantPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){

            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i]= sc.nextInt();
            }
            int cnt=0;
            for(int i=0; i<n; i++){
                if(arr[i]<3&&arr[i]>(n+n-1)){
                    continue;
                }
                int ind = arr[i]-(i+1);
//                System.out.println("ind "+ind);
                int val=arr[i];
//                System.out.println("val "+val);
                for(int j=ind-1; j<n; j+=arr[i]){
//                    System.out.println("j "+j);
                    if((j+1)>i+1){

                        if((arr[j]==((i+j+2)/val))&&(i+j+2)%val==0){
                            cnt++;
//                            System.out.println("cnt"+cnt);
                        }
                    }

                }
            }
            System.out.println(cnt);
        }
    }
}
