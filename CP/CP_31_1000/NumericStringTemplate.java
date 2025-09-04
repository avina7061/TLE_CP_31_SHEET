package TLE_CP_31_SHEET.CP.CP_31_1000;

import java.util.HashMap;
import java.util.Scanner;

public class NumericStringTemplate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
            int m = sc.nextInt();
            String ans[] = new String[m];
            for(int i=0; i<m; i++){

                String s = sc.next();
                if(s.length()!=n){
                    ans[i]="No";
                    continue;
                }
                boolean bt =true;
                HashMap<Character,Integer> map1 =new HashMap<>();
                HashMap<Integer,Character> map2 =new HashMap<>();
                for(int j=0; j<s.length(); j++){
                    if(map1.containsKey(s.charAt(j))){
                        if(map1.get(s.charAt(j))!=arr[j]){
                            ans[i]="No";
                            bt=false;
                            break;
                        }
                    }
                    if(map2.containsKey(arr[j])){
                        if(map2.get(arr[j])!=s.charAt(j)){
                            ans[i]="No";
                            bt =false;
                            break;
                        }
                    }
                    map1.put(s.charAt(j),arr[j]);
                    map2.put(arr[j],s.charAt(j));
                }
                if(bt)ans[i]="Yes";
            }
            for(String s: ans){
                System.out.println(s);
            }
        }
    }
}
