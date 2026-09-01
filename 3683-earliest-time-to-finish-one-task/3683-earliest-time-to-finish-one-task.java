class Solution {
    public int earliestTime(int[][] tasks) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < tasks.length; i++) {

            int sum = tasks[i][0] + tasks[i][1];

            if (sum < min) {
                min = sum;
            }
        }
        return min;
    }
}