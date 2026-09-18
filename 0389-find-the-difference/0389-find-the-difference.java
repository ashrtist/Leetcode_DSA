class Solution {
    public char findTheDifference(String s, String t) {
        char result=0;

        for(char c:s.toCharArray())
        {
            result=(char)(result^c);
        }
    
        // result=a^b^c^d

        for(char c:t.toCharArray())
        {
            result=(char)(result^c);
        }
        // result = cancels all and remained e
        return result;
    }
}