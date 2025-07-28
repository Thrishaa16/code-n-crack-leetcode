class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minSize=Integer.MAX_VALUE;
        int sum=0;
        int left=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>=target){
                int ws=right-left+1;
                if(minSize>ws)
                    minSize=ws;
                sum-=nums[left];
                left++;
            }
        }
        if(minSize==Integer.MAX_VALUE)
            return 0;
    return minSize;
    }
}