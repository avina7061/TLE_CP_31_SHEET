package TLE_CP_31_SHEET.CP.CP_31_1300;

import java.util.HashMap;
import java.util.Scanner;

public class BalancedTunnel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                int n = sc.nextInt();
                int arr[] = new int[n];
                int brr[] = new int[n];
                for(int i=0; i<n; i++){
                    arr[i]=sc.nextInt();
                }
                HashMap<Integer,Integer>map = new HashMap<>();
                for(int i=0; i<n; i++){
                    brr[i]=sc.nextInt();
                    map.put(brr[i],i+1);
                }
                int c[] = new int[n];
                for(int i=0; i<n; i++){
                    c[i]=map.get(arr[i]);
//                    System.out.println(c[i]);
                }
                int cnt=0;
                int max=Integer.MIN_VALUE;
                for(int i=0; i<n; i++){
                    if(c[i]<max){
                        cnt++;
                    }
                    max=Math.max(max,c[i]);
                }
            System.out.println(cnt);
        }
    }

