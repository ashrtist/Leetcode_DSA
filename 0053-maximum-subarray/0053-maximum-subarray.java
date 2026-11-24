class Solution {
    public int maxSubArray(int[] nums) {
        //Kadane's Algorithm
        int sum=nums[0];
        int maxSum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            sum=Math.max(nums[i],sum+nums[i]);
            if(sum>maxSum)
            {
                maxSum=sum;
            }
        }
        return maxSum;
    }
}