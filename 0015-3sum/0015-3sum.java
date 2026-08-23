class Solution {
    public List<List<Integer>> threeSum(int[] a) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(a);

        for (int i = 0; i < a.length - 2; i++) {

            // Skip duplicate first elements
            if (i > 0 && a[i] == a[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = a.length - 1;

            while (j < k) {

                int sum = a[i] + a[j] + a[k];

                if (sum == 0) {

                    result.add(Arrays.asList(a[i], a[j], a[k]));

                    // Skip duplicate second elements
                    while (j < k && a[j] == a[j + 1]) {
                        j++;
                    }

                    // Skip duplicate third elements
                    while (j < k && a[k] == a[k - 1]) {
                        k--;
                    }

                    j++;
                    k--;

                } 
                else if (sum < 0) {
                    j++;
                } 
                else {
                    k--;
                }
            }
        }

        return result;
    }
}