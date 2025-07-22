class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int sum =0 ;
        int left =0;
        int max = 0;
        for(int right = 0;right<nums.length;right++){
            while(hs.contains(nums[right])){
                hs.remove(nums[left]);
                sum-=nums[left];
                left++;
            }        
            hs.add(nums[right]);
            sum += nums[right];
            max=Math.max(sum,max);
        }
        return max;
    }
}