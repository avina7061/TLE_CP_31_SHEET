package TLE_CP_31_SHEET.CP.CP_31_800;

import java.util.Scanner;

public class binaryMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            int m =sc.nextInt();
            char dp[][] = new char[n][m];
            for(int i=0; i<n; i++){
                dp[i]= sc.next().toCharArray();
            }
            int cnt=0;
            int cn=0;
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    if(dp[i][j]=='1')cn++;
                }
            }
            for(int i =0;i<n; i++){
                for(int j=0; j<m; j++){
                    int rowCnt=0;
                    int colCnt=0;

                    for(int k=0; k<m; k++){
                        if(dp[i][k]=='1'){
                            rowCnt++;
                        }
                    }
                    for(int k=0; k<n; k++){
                        if(dp[k][j]=='1'){
                            colCnt++;
                        }
                    }

                    if(rowCnt%2!=0&&colCnt%2!=0){
                        if(dp[i][j]=='1'){
                            dp[i][j]='0';
                        }
                        else{
                            dp[i][j]='1';
                        }
                        cnt++;
                    }
                }

            }
            boolean bt =true;
            for(int i =0;i<n; i++){
                for(int j=0; j<m; j++){
                    int rowCnt=0;
                    int colCnt=0;
                    for(int k=0; k<m; k++){
                        if(dp[i][k]=='1'){
                            rowCnt++;
                        }
                    }
                    for(int k=0; k<n; k++){
                        if(dp[k][j]=='1'){
                            colCnt++;
                        }
                    }

                    if(rowCnt%2!=0||colCnt%2!=0){
                        System.out.println(cn);
                        bt=false;
                        break;
                    }
                }
                if(!bt){
                    break;
                }

            }
            if(bt){
                System.out.println(cnt);
            }

        }
    }
}
