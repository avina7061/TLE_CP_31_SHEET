package TLE_CP_31_SHEET.CP.CP_31_1400;

import java.util.HashMap;
import java.util.Scanner;

public class BeautifulTriplePairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            HashMap<String,Integer> ab = new HashMap<>();
            HashMap<String,Integer> bc = new HashMap<>();
            HashMap<String,Integer> ac = new HashMap<>();
            HashMap<String,Integer> abc = new HashMap<>();
            long ans=0;
            for(int i=0;i<n-2; i++){
                 String s1=arr[i]+","+arr[i+1];
                String s2=arr[i+1]+","+arr[i+2];
                String s3=arr[i]+","+arr[i+2];
                String s4=arr[i]+","+arr[i+1]+","+arr[i+2];
//                System.out.println(s4);
                ab.put(s1,ab.getOrDefault(s1,0)+1);
                bc.put(s2,bc.getOrDefault(s2,0)+1);
                ac.put(s3,ac.getOrDefault(s3,0)+1);
                abc.put(s4,abc.getOrDefault(s4,0)+1);
                ans+=ab.get(s1)-abc.get(s4);
                ans+=bc.get(s2)-abc.get(s4);
                ans+=ac.get(s3)-abc.get(s4);
            }

            System.out.println(ans);
        }
    }
}
