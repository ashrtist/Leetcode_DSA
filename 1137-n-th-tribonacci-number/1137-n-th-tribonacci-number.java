class Solution {
    public int tribonacci(int n) {
        // 0 1 1 -->2
        if(n<=1) return n;//n=4 false
        int[] dp = new int[n+1]; //size-->5
        dp[1]=1;
        dp[2]=1;

        // 0 1 1 2 4
        // 0 1 2 3 4
        //          4<=4-->true
        for(int i=3;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3]; //dp[4]=dp[4-1]+dp[4-2]+dp[4-3]
                                           //dp[4]=dp[3]+dp[2]+dp[1]
                                           //dp[3]=4
        }
        return dp[n];
    }
}