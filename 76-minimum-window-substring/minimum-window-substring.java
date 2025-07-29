class Solution {
    public String minWindow(String s, String t) {
  
        int[] charCount = new int[128]; 
        for (char c : t.toCharArray()) {
            charCount[c]++; 
        }
        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        int req = t.length();
        while (right<s.length()) {
            char cur =s.charAt(right);
            if (charCount[cur]>0) {
                req--; 
            }
            charCount[cur]--; 
            right++;
            while (req == 0) {
                if (right-left<minLen) {
                    minLen=right-left;
                    start=left;
                }
                char leftChar = s.charAt(left);
                charCount[leftChar]++; 
                if (charCount[leftChar] > 0) {
                    req++; 
                }
                left++;
            }
        }
        if (minLen==Integer.MAX_VALUE) {
            return "";
        } else {
            return s.substring(start,start+minLen);
}

    }
}
