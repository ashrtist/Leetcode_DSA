
class Solution {

    public String reverseVowels(String s) {

        char[] chars = s.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        String vowels = "aeiouAEIOU";

        while (left < right) {

            // If left character is NOT a vowel
            if (vowels.indexOf(chars[left]) == -1) {
                left++;
            }

            // If right character is NOT a vowel
            else if (vowels.indexOf(chars[right]) == -1) {
                right--;
            }

            // Both are vowels → swap
            else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;

                left++;
                right--;
            }
        }

        return new String(chars);
    }
}
