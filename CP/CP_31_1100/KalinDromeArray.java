    package TLE_CP_31_SHEET.CP.CP_31_1100;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.Scanner;

    public class KalinDromeArray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t= sc.nextInt();
            while(t-->0){
                int n = sc.nextInt();
                int arr[] = new int[n];
                HashMap<Integer,Integer>map = new HashMap<>();
                for(int i=0; i<n; i++){
                    arr[i]= sc.nextInt();
                    map.put(arr[i],map.getOrDefault(arr[i],0)+1);
                }
                int cnt=0;
                for(int i: map.keySet()){
                    if(map.get(i)==1){
                        cnt++;
                    }
                }
                if(cnt>2){
                    System.out.println("No");
                    continue;
                }
                boolean bc =true;
                ArrayList<Integer>list = new ArrayList<>();
                int l=0; int k=n-1;
                while(l<k){
                    if(arr[l]!=arr[k]){
                        list.add(arr[l]);
                        list.add(arr[k]);
                        break;
                    }
                    l++;
                    k--;
                }
                if(list.size()==0){
                    System.out.println("Yes");
                    continue;
                }
                for (int m : list) {
                    int val = m;
                    int i = 0;
                    int j = n - 1;
                    bc = true;

                    while (i < j) {
                        if (arr[i] == val) {
                            i++;
                            continue;
                        }
                        if (arr[j] == val) {
                            j--;
                            continue;
                        }
                        if (arr[i] != arr[j]) {
                            bc = false;
                            break;
                        }
                        i++;
                        j--;
                    }
                    if (bc) {
                        System.out.println("Yes");
                        break;
                    }
                }

                if(!bc){
                    System.out.println("No");
                }


            }
        }
    }
