    package TLE_CP_31_SHEET.CP.CP_31_1200;

    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Scanner;

    public class extOne {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t= sc.nextInt();
            while(t-->0){
                int n = sc.nextInt();
                int k = sc.nextInt();
                int arr[] = new int[n];
                int cpy[] = new int[n];
                for(int i=0; i<n; i++){
                    arr[i]=sc.nextInt();
                    cpy[i]=arr[i];
                }
                if (k == 1) {
                    System.out.println("Yes");
                    continue;
                }


                Arrays.sort(cpy);
                int val=cpy[k-1];
                ArrayList<Integer>list= new ArrayList<>();
                for(int i:arr){
                    if(i<=val){
                        list.add(i);
                    }
                }
                int x=list.size()-k+1;
                int left=0;
                int right=list.size()-1;
                boolean om =true;
                while(left<right){
                    if(!list.get(left).equals(list.get(right))){
                        if(list.get(left)==val&&x>0){
                            x--;
                            left++;
                        }
                        else if(list.get(right)==val&&x>0){
                            x--;
                            right--;
                        }
                        else{
                            System.out.println("No");
                            om=false;
                            break;
                        }
                    }
                    else{
                        left++;
                        right--;
                    }
                }
                if(om) System.out.println("Yes");
            }
        }
    }
