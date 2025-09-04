package TLE_CP_31_SHEET.CP.CP_31_1300;

import java.util.Scanner;

public class ThisIsGreat {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long w= sc.nextLong();
            int arr[] = new int[n];
            for(int i=0;i<n; i++){
                arr[i]=sc.nextInt();
            }
            int freq[] = new int[21];
            long total=0;
            for(int i=0; i<n; i++){
                int val=(int)(Math.log(arr[i])/Math.log(2));
                freq[val]++;
                total+=arr[i];
            }
            long ht=0;
            while(total>0){
                long curW=w;
                for(int  i=20; i>=0; i--){
                    int val =(int) Math.pow(2,i);
                    while(freq[i]>0&&val<=curW){
                        curW-=val;
                        freq[i]--;
                        total-=val;
                    }
                    if(curW==0){
                        break;
                    }
                }
                ht++;
            }
            System.out.println(ht);
        }
    }
}
