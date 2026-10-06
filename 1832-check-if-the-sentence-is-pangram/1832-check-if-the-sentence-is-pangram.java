class Solution {
    public boolean checkIfPangram(String sentence) {
        String s = "qwertyuiopasdfghjklzxcvbnm";
        //boolean flag=true;
        
        for(int i=0;i<s.length();i++)
        {
            //flag=true;
            if(sentence.indexOf(s.charAt(i))==-1)
            {
                return false;
            }
        }
        return true;
    }
}