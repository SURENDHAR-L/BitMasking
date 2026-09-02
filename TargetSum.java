class Solution {
  //  111524202055 Surendhar L
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }

        if(Math.abs(target)>sum){
            return 0;
        }

        int offset=sum;
        int[][] dp=new int[nums.length+1][2*sum+1];

        dp[0][offset]=1;

        for(int i=0;i<nums.length;i++){
            for(int s=0;s<=2*sum;s++){
                if(dp[i][s]>0){
                    dp[i+1][s+nums[i]]+=dp[i][s];
                    dp[i+1][s-nums[i]]+=dp[i][s];
                }
            }
        }

        return dp[nums.length][target+offset];
    }
}