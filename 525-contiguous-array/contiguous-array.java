import java.util.HashMap;

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);  

        int maxLen = 0;
        int sum = 0;

        for (int i=0;i<nums.length;i++) {
            sum += nums[i] == 0 ? -1 : 1;
            if(map.containsKey(sum)) {  
                maxLen = Math.max(maxLen, i-map.get(sum));
            }else{    
                map.put(sum, i);
            }
        }
        return maxLen;
    }
}
