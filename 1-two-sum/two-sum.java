class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        for(int i=1;i<n;i++){
            for(int j=i;j<n;j++){
                if(nums[j-i]+nums[j]==target)
                    return new int[]{j,j-i};
            }
        }
        return null;
    }
}