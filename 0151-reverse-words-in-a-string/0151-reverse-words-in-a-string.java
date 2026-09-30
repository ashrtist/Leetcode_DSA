class Solution {
    public String reverseWords(String s) {

        int n = s.length();
        String ans = "";

        // Reverse the complete string
        StringBuilder str = new StringBuilder(s);
        str.reverse();

        for (int i = 0; i < n; i++) {

            String word = "";

            // Pick characters until space
            while (i < n && str.charAt(i) != ' ') {
                word = word + str.charAt(i);
                i++;
            }

            // Reverse the word
            StringBuilder temp = new StringBuilder(word);
            temp.reverse();
            word = temp.toString();

            // Add word to answer
            if (word.length() > 0) {
                ans = ans + " " + word;
            }
        }

        // Remove first extra space
        return ans.substring(1);
    }
}