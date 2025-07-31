class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        backtrack(res,new ArrayList<>(),nums);
        return res;
    }

    private void backtrack(List<List<Integer>> res, ArrayList<Integer> temp,int[] nums){
        if(temp.size() == nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int num:nums){
            if(temp.contains(num))
                continue;                   //because only distinct integers
            temp.add(num);
            backtrack(res,temp,nums);
            temp.remove(temp.size()-1);
        }
    }
}