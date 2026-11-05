class Solution {
    public int fib(int n) {
        if(n<=1)
        {
            return n;
        }
        int a[] =new int[n+1]; //3 --> 0 1 2 
        a[0]=0; //0-->0
        a[1]=1; //1-->1

        // 0 1 1
        // 0 1 2
        //          2<=2 true
        for(int i=2;i<=n;i++)
        {
            a[i]=a[i-1]+a[i-2]; //a[2]=1
        }
        return a[n]; //a[2]--->1
    }
}