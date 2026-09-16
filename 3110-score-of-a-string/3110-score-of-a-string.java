class Solution {
    public int scoreOfString(String s) {
        int sum=0;

        for(int i=0,j=1;j<s.length();i++,j++)
        {
            sum=sum+Math.abs((int)s.charAt(i)-(int)s.charAt(j));
        }
        return sum;
    }
}