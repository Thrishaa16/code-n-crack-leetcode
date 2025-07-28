class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for (int i : nums){
            set.add(i);
        }
        for(int j=1; j<=nums.length+1;j++){
            if(!set.contains(j)){     
            return j;
            }
        }
        return -1;

    }
}