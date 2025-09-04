package TLE_CP_31_SHEET.CP.CP_31_1200;

import java.util.Scanner;

public class MedianSplits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            int cnt = 0;
            boolean bt = true;
            int j = 0;
            boolean om = true;

            for (int i = 0; i < n - 1; i++) {
                if (arr[i] <= k && bt) {
                    cnt++;
                }
                if (cnt >= (i + 2) / 2 && bt) {
                    if (i + 1 < n - 1 && arr[i + 1] > k && (i + 1) % 2 != 0) {
                        i++;
                    }
                    j = i;
                    cnt = 0;
                    bt = false;
                    continue;
                }
                if (!bt) {
                    if (arr[i] <= k) {
                        cnt++;
                    }
                    if (cnt >= (i - j + 1) / 2) {
                        System.out.println("Yes");
                        om = false;
                        break;
                    }
                }
            }

            if (om) {
                bt = true;
                cnt = 0;
                for (int i = n - 1; i > 0; i--) {
                    if (arr[i] <= k && bt) {
                        cnt++;
                    }
                    if (cnt >= (n - i + 1) / 2 && bt) {
                        if (i - 1 > 0 && arr[i - 1] > k && (n - i + 2) % 2 != 0) {
                            i--;
                        }
                        j = i;
                        cnt = 0;
                        bt = false;
                        continue;
                    }
                    if (!bt) {
                        if (arr[i] <= k) {
                            cnt++;
                        }
                        if (cnt >= (j - i + 1) / 2) {
                            System.out.println("Yes");
                            om = false;
                            break;
                        }
                    }
                }
            }

            if (om) {
                cnt = 0;
                int ind = 0;
                bt = true;
                boolean a = false, b = false;

                for (int i = 0; i < n - 2; i++) {
                    if (arr[i] <= k && bt) {
                        cnt++;
                    }
                    if (cnt >= (i + 2) / 2) {
                        cnt = 0;
                        a = true;
                        ind = i;
                        break;
                    }
                }

                cnt = 0;
                for (int i = n - 1; i > ind + 1; i--) {
                    if (arr[i] <= k && bt) {
                        cnt++;
                    }
                    if (cnt >= (n - i + 1) / 2) {
                        b = true;
                        break;
                    }
                }

                if (a && b) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }
}

//
//import java.util.Scanner;
//
//public class MedianSplits {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t= sc.nextInt();
//        while(t-- > 0){
//            int n = sc.nextInt();
//            long k = sc.nextLong();
//            long arr[] = new long[n];
//            for(int i = 0; i < n; i++){
//                arr[i] = sc.nextLong();
//            }
//
//            int cnt = 0;
//            boolean bt = true;
//            int j = 0;
//            boolean om = true;
//
//            // ✅ First segment: Left to mid
//            for(int i = 0; i < n - 1; i++){
//                if(arr[i] <= k && bt){
//                    cnt++;
//                }
//                if(cnt >= (i + 2) / 2 && bt){  // ✅ Fixed: use >= instead of ==
//                    if(i + 1 < n - 1 && arr[i + 1] > k && (i + 1) % 2 != 0){
//                        i++;
//                    }
//                    j = i;
//                    cnt = 0;
//                    bt = false;
//                    continue;
//                }
//                if(!bt){
//                    if(arr[i] <= k){
//                        cnt++;
//                    }
//                    if(cnt >= (i -j+1) / 2){  // ✅ Fixed: use >= instead of ==
//                        System.out.println("Yes");
//                        om = false;
//                        break;
//                    }
//                }
//            }
//
//            // ✅ Second segment: Right to mid
//            if(om){
//                bt = true;
//                cnt = 0;
//                for(int i = n - 1; i > 0; i--){
//                    if(arr[i] <= k && bt){
//                        cnt++;
//                    }
//                    if(cnt >= (n - i + 1) / 2 && bt){  // ✅ Fixed: was == before
//                        if(i - 1 > 0 && arr[i - 1] > k && (n - i + 2) % 2 != 0){
//                            i--;
//                        }
//                        j = i;
//                        cnt = 0;
//                        bt = false;
//                        continue;
//                    }
//                    if(!bt){
//                        if(arr[i] <= k){
//                            cnt++;
//                        }
//                        if(cnt >= (j - i + 1) / 2){  // ✅ use >= instead of ==
//                            System.out.println("Yes");
//                            om = false;
//                            break;
//                        }
//                    }
//                }
//            }
//
//            // ✅ Third segment: Left + Right separate
//            if(om){
//                cnt = 0;
//                int ind = 0;
//                bt = true;
//                boolean a = false;
//                boolean b = false;
//
//                for(int i = 0; i < n - 2; i++){
//                    if(arr[i] <= k && bt){
//                        cnt++;
//                    }
//                    if(cnt >= (i + 2) / 2){  // ✅ use >= instead of ==
//                        cnt = 0;
//                        a = true;
//                        ind = i;
//                        break;
//                    }
//                }
//
//                cnt = 0;
//                for(int i = n - 1; i > ind + 1; i--){
//                    if(arr[i] <= k && bt){
//                        cnt++;
//                    }
//                    if(cnt >= (n - i + 1) / 2){  // ✅ use >= instead of ==
//                        b = true;
//                        break;
//                    }
//                }
//
//                if(a && b){
//                    System.out.println("Yes");
//                }
//                else{
//                    System.out.println("No");
//                }
//            }
//        }
//    }
//}
