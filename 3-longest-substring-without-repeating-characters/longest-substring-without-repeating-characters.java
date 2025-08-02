class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> hs = new HashSet<>();

        int n = s.length();
        int i = 0;
        int left = 0;
        int max = 0;
        while(i<n){
            while(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(s.charAt(i));
            i++;
            max = Math.max(max,hs.size());
        }
        return max;
    }
}