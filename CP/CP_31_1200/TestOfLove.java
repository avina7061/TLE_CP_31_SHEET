package TLE_CP_31_SHEET.CP.CP_31_1200;

import java.util.Scanner;

public class TestOfLove {
                public static void main(String[] args) {
                    Scanner sc= new Scanner(System.in);
                    int t=sc.nextInt();
                    while(t-->0){
                        int n =sc.nextInt();
                        int m =sc.nextInt();
                        int k =sc.nextInt();
                        String p =sc.next();
                        String s = "L" + p + "L";

                        int dp[] = new int[s.length()];

                        dp[s.length()-1] = 0;

                        for(int i=s.length()-2; i>=0; i--){
                            if(s.charAt(i)=='C'){
                                dp[i]=Integer.MAX_VALUE;
                            }
                            else if(s.charAt(i)=='W'){
                                if(dp[i+1]==Integer.MAX_VALUE){
                                    dp[i] = dp[i+1];
                                }
                                else{
                                    dp[i]=dp[i+1]+1;
                                }
                            }
                            else{
                                int min=Integer.MAX_VALUE;
                                for(int j=i+1; j<=i+m && j<s.length(); j++){
                                    min=Math.min(min,dp[j]);
                                }
                                dp[i]=min;
                            }
                        }
                        if(dp[0]>k||dp[0]==Integer.MAX_VALUE){
                            System.out.println("No");
                        }
                        else{
                            System.out.println("Yes");
                        }
                    }
                }
            }
