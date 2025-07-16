class Solution {
    public int smallestIndex(int[] nums) {
        int ans = 0;
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            while(nums[i]>0){
                ans = nums[i] % 10;
                res[i] += ans;
                nums[i] = nums[i] / 10;
            }
        }
        for(int i = 0;i<res.length;i++){
            if(res[i]==i)return i;
        }
        return -1;
    }
}