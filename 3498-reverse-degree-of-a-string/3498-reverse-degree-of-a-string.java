class Solution {
    public int reverseDegree(String s) {
    String alpha = "zyxwvutsrqponmlkjihgfedcba";
    char ch[]=alpha.toCharArray();
    int sum=0;
    for(int i=0;i<s.length();i++)
    {
        for(int j=0;j<ch.length;j++)
        {
            if(s.charAt(i)==ch[j])
            {
                sum=sum+(j+1)*(i+1);
            }
        }
    }
    return sum;
    }
}