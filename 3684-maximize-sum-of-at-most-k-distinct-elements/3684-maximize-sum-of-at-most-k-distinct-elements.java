
class Solution {

    public int[] maxKDistinct(int[] nums, int k) {

        Arrays.sort(nums);

        int[] a = new int[k];
        int count = 0;

        for (int i = nums.length - 1; i >= 0 && count < k; i--) {

            if (i == nums.length - 1 || nums[i] != nums[i + 1]) {
                a[count] = nums[i];
                count++;
            }
        }

        return Arrays.copyOf(a, count);
    }
}