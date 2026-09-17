class Solution {
    public boolean isAnagram(String s, String t) {
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        String str = new String (ch);

        char c[] = t.toCharArray();
        Arrays.sort(c);
        String st = new String (c);

        if(str.equals(st))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}