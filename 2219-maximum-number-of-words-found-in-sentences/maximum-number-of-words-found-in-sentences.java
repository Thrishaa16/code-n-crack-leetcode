class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans = 0;
        for(String s : sentences){
            String[] word = s.split(" ");
            ans = Math.max(word.length,ans);
        }
        return ans;
    }
}