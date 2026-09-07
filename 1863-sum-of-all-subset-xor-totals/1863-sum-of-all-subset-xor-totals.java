class Solution {

    public int subsetXORSum(int[] nums) {
        return findXOR(nums, 0, 0);
    }

    public int findXOR(int[] nums, int index, int xor) {

        // all elements processed
        if (index == nums.length) {
            return xor;
        }

        // Two choices:
        // 1. Include nums[index]
        // 2. Don't include nums[index]

        int include = findXOR(
            nums,
            index + 1,
            xor ^ nums[index]
        );

        int exclude = findXOR(
            nums,
            index + 1,
            xor
        );

        return include + exclude;
    }
}