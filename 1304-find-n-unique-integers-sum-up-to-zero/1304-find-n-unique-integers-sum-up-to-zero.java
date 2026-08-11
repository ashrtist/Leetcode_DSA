class Solution {
    public int[] sumZero(int n) {
        int neg = -(n / 2);
        int[] a = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            a[i] = neg;
            sum += a[i];
            neg++;
        }

        a[n - 1] = a[n-1]-sum;

        return a;
    }
}