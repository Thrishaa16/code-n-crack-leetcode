class Solution {
    public int[] numberGame(int[] nums) {

        Arrays.sort(nums);

        for(int i = 0; i<nums.length-1;i=i+2){
            int a=nums[i];
            nums[i]=nums[i+1];
            nums[i+1]=a;
        }
        return nums;
    }
}