package TLE_CP_31_SHEET.CP.CP_31_1100;

import java.util.Scanner;

public class min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int s=sc.nextInt();
            int arr[] = new int[n];
            int sum=0;
            int cnt2=0;
            int cnt1=0;
            int cnt0=0;
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
                sum+=arr[i];
                if(arr[i]==0){
                    cnt0++;
                }
                else if(arr[i]==1){
                    cnt1++;
                }
                else cnt2++;
            }
//            HashSet<Integer>set = new HashSet<>();
//            for(int i=1;i<n; i++){
//                set.add(arr[i]+arr[i-1]);
//            }
            if(sum==s){
                System.out.println(-1);
                continue;
            }
            else if(sum>s){
                for(int i: arr){
                    System.out.print(i+" ");
                }
                System.out.println();
                continue;
            }
            else{
                int ac[] = new int[n];
                int four =-1;
                if(cnt2>1){
//                    System.out.println("exe");
                    four=4;
                }
                for(int i=0; i<n; i++){
                    if(cnt0>0){
                        ac[i]=0;
                        cnt0--;
                    }
                    else if(cnt2>0){
                        ac[i]=2;
                        cnt2--;
                    }
                    else if(cnt1>0){
                        ac[i]=1;
                        cnt1--;
                    }
                }


                int rest =s-sum;
//               System.out.println(rest);
//                if(four!=-1&&rest>=4){
//                    if(rest%4==0||rest%4==2||rest%4==3){
//                        System.out.println(-1);
//                        continue;
//                    }
//                }
                if(rest>=3){
                    System.out.println(-1);
                    continue;
                }
                if(rest%2==0){
                    System.out.println(-1);
                    continue;
                }
                for(int i: ac){
                    System.out.print(i+" ");
                }
                System.out.println();
            }

        }
    }
}
