
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Store frequencies
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] result = new int[Math.min(nums1.length, nums2.length)];
        int k = 0;

        // Step 2: Find intersection
        for (int num : nums2) {

            if (map.containsKey(num) && map.get(num) > 0) {

                result[k++] = num;

                // Decrease frequency
                map.put(num, map.get(num) - 1);
            }
        }

        return Arrays.copyOf(result, k);
    }
}
