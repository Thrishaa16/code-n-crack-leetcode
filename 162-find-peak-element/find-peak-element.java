class Solution {
    public int findPeakElement(int[] nums) {
        int max = nums[0],n=0;
        for(int i = 0;i<nums.length;i++){
            if(max<nums[i]){
                max = nums[i];
                n=i;
            }

        }
        return n;
    }

}