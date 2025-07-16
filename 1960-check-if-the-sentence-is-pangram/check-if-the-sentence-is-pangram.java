class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] nums = new int[26];
        for(int i=0;i<sentence.length();i++){
            nums[sentence.charAt(i)-'a']=1;
        }
        for(int i=0;i<26;i++){
            if(nums[i]==0)return false;
        }
        return true;
    }

}