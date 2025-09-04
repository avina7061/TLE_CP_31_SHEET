package TLE_CP_31_SHEET.CP.CP_31_1000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class HelmetsInNightLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int p = sc.nextInt();
            int arr[] = new int[n];
            int brr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                brr[j] = sc.nextInt();
            }

            HashMap<Integer, Long> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                map.put(brr[i], map.getOrDefault(brr[i], 0L) + arr[i]);
            }

            ArrayList<Integer> list = new ArrayList<>();
            for (int mp : map.keySet()) {
                if (mp < p) {
                    list.add(mp);
                }
            }
            Collections.sort(list);

            long cost = p;
            long remaining = n - 1;

            if (list.isEmpty()) {
                System.out.println((long) p * n);
                continue;
            }

            int i = 0;
            while (i < list.size() && remaining > 0) {
                int price = list.get(i);
                long quantity = map.get(price);

                if (quantity >= remaining) {
                    cost += remaining * price;
                    remaining = 0;
                } else {
                    cost += quantity * price;
                    remaining -= quantity;
                    i++;
                }
            }

            if (remaining > 0) {
                cost += remaining * p;
            }

            System.out.println(cost);
        }
    }
}