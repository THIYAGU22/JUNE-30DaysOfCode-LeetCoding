class CoinChange2_Day7 {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length][amount+1];
        for(int i = 0 ; i < coins.length ; ++i)
            Arrays.fill(dp[i],-1);
        return recursion(dp,0,amount,coins);
    }
    public static int recursion(int[][] dp,int curr_idx,int amount,int[] coins)
    {
        if(amount==0)
            return 1;
        if(amount<0 || curr_idx==coins.length)
            return 0;
        if(dp[curr_idx][amount]!=-1)
            return dp[curr_idx][amount];
        return dp[curr_idx][amount] = recursion(dp,curr_idx,amount-coins[curr_idx],coins) + recursion(dp,curr_idx+1,amount,coins);
    }
}
