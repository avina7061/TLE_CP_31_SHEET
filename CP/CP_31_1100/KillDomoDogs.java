package TLE_CP_31_SHEET.CP.CP_31_1100;

import java.util.Scanner;

public class KillDomoDogs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long mod = 1000000007;
        long inv6 = 166666668;
        while(t-- > 0){
            long n = sc.nextLong();

            long n2 = (n * n) % mod;
            long n3 = (n2 * n) % mod;

            long part1 = (4 * n3) % mod;
            long part2 = (3 * n2) % mod;
            long total = (part1 + part2 - n + mod) % mod;

            long result = (total * inv6) % mod;
            long finalAns = (result * 2022) % mod;

            System.out.println(finalAns);
        }
    }
}
