package TLE_CP_31_SHEET.CP.CP_31_1200;

import java.util.ArrayList;
import java.util.Scanner;

public class FlipTheBits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String a=sc.next();
            String b=sc.next();
            int pre0[] = new int[n];
            int pre1[] = new int[n];
            if(a.charAt(0)=='0'){
                pre0[0]=1;
            }
            else{
                pre1[0]=1;
            }
            for(int i=1; i<n; i++){
                if(a.charAt(i)=='0'){
                    pre0[i]=pre0[i-1]+1;
                    pre1[i]=pre1[i-1];
                }
                else{
                    pre0[i]=pre0[i-1];
                    pre1[i]=pre1[i-1]+1;
                }
            }
            int i=n-1;
            while(i>=0){
                if(a.charAt(i)==b.charAt(i)){
                    i--;
                }
                else{
                    break;
                }
            }
            if(i<0){
                System.out.println("Yes");
                continue;
            }
            ArrayList<Integer> chagePoint = new ArrayList<>();
            for(int j=1; j<=i; j++){
                if(a.charAt(j-1)!=b.charAt(j-1)&&a.charAt(j)==b.charAt(j)||a.charAt(j-1)==b.charAt(j-1)&&a.charAt(j)!=b.charAt(j)){
                    chagePoint.add(j-1);
                }
            }
            chagePoint.add(i);
            boolean tc =true;
            for(int k: chagePoint){
                if(pre0[k]!=pre1[k]){
                    System.out.println("No");
                    tc=false;
                    break;
                }
            }
            if(tc) System.out.println("Yes");
        }
    }
}
