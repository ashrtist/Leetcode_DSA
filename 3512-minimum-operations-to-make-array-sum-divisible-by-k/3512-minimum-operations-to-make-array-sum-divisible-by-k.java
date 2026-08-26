class Solution {
    public int minOperations(int[] nums, int k) {  
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
        }
        if(sum%k==0)
        {
            return 0;
        }
        else if(sum>k)
        {
            return sum % k;
        }
        else if(sum<k)
        {
            return sum;
        }
        else
        {
            return k-sum;
        }
        
    }
}