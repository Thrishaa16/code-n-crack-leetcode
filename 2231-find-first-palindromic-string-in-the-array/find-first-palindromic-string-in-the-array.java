class Solution {
    public String firstPalindrome(String[] words) {
        for(String word:words){
           if(palindrome(word))
                return word;
        }
        
        return "";
    }

    boolean palindrome(String words){
        int left = 0;
        int right = words.length()-1;
        while(left<right){
            if(words.charAt(left)!= words.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}