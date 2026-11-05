class Solution {
    public int[] countBits(int n) {
        if(n==0) return new int[]{0};
        int[] dp = new int[n+1]; //size-->3
        //dp[0]=0; 
        dp[1]=1;

        if(n<=1) return dp; //2<=1-- false

        // 0 1 1
        // 0 1 2
        //          2<=2 -->true 
        for(int i=2;i<=n;i++)
        {
            dp[i]=dp[i/2]+dp[i%2]; //dp[2]=1
        }
        return dp;
    }
}