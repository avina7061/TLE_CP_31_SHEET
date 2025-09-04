package TLE_CP_31_SHEET.CP.CP_31_1200;

import java.util.ArrayList;
import java.util.Scanner;

public class VikaAndTheBridge {
    public static void printColoring(ArrayList<Integer>[] coloring) {
        for (int i = 0; i < coloring.length; i++) {
            System.out.print("coloring[" + i + "] = ");
            for (int val : coloring[i]) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k =sc.nextInt();
            int c[] = new int[n];
            for(int i=0; i<n; i++){
                c[i]= sc.nextInt();
            }
            ArrayList<Integer>[] coloring = new ArrayList[k+1];
            for(int i=0; i<k+1; i++){
                coloring[i]=new ArrayList<>();
            }
            for(int i=1; i<=k; i++){
                coloring[i].add(0);
            }
            for(int j=0; j<n; j++){
                coloring[c[j]].add(j+1);
            }
            for(int i=1; i<=k; i++){
                coloring[i].add(n+1);
            }
//            printColoring(coloring);
            int ans=Integer.MAX_VALUE;
            for(int i=1; i<=k; i++){
                ArrayList<Integer> list =coloring[i];
                int max=Integer.MIN_VALUE;
                int prevMax=Integer.MIN_VALUE;
                for(int j=0; j<list.size()-1; j++){
                    max=Math.max(list.get(j+1)-list.get(j)-1,max);
                }
                boolean bc =false;
                for(int j=0; j<list.size()-1; j++){
                    if(list.get(j+1)-list.get(j)-1!=max||bc){
                        prevMax=Math.max(prevMax,list.get(j+1)-list.get(j)-1);
                    }
                    else{
                        bc=true;
                    }
                }
              int store = Math.max(max/2,prevMax);
                ans=Math.min(ans,store);
            }

            System.out.println(ans);

        }
    }
}
