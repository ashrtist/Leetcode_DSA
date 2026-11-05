class Solution {
    public int climbStairs(int n) {
        if(n<=2) return n; //base case ..jab value 2 ya 2 se neeche return value

        int a[] = new int[n+1]; //3+1-->4
        a[1]=1;
        a[2]=2;

        // 0 1 2 3
        // 0 1 2 3
        //           3<=3 true
        for(int i=3 ;i<=n;i++)
        {
            a[i] = a[i-1] + a[i-2]; //a[3] = 3 
        }
        return a[n];//a[3]-->3
    }
}