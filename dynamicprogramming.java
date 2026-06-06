import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        int[][] arr = new int[row][col];
        int[][] dp = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = scan.nextInt();
            }
        }
        int n = row;
        int m = col;
        System.out.println("---UPdated Dp MAtrix---");
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                if(j == 0){
                    dp[i][j] = arr[i][j];
                    continue;
                }
                int[] ans = firstMax(dp,j-1,row);
                if(dp[i][j-1] == ans[0]){
                    dp[i][j] = arr[i][j] + ans[1];
                }
                else{
                    dp[i][j] = arr[i][j] + ans[0];
                }
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        
        int maximum = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(dp[i][j] >  maximum){
                    maximum = dp[i][j];
                }
            }
        }
        System.out.println(maximum);
        
    }

    public static int[] firstMax(int[][] dp,int k,int row){
        int[] ans = new int[2];
        ans[0] = Math.max(dp[0][k],dp[1][k]);
        ans[1] = Math.min(dp[0][k],dp[1][k]);
        for(int i=0;i<row;i++){
            if(dp[i][k] > ans[0]){
                ans[1] = ans[0];
                ans[0] = dp[i][k];
            }
            else if(dp[i][k] > ans[1] && dp[i][k] < ans[0]){
                ans[1] = dp[i][k];
            }
        }
        return ans;
    }
}