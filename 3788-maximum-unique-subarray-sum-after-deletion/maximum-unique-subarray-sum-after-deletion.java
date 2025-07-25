class Solution {
    public int maxSum(int[] nums) {
       HashSet<Integer>h=new HashSet<>();
       int sum=Integer.MIN_VALUE;
       int ans=0;
       for(int num:nums){
        if(num<=0){
            sum=Math.max(sum,num);
        }
        while(!h.contains(num) && num>0){
            h.add(num);
            ans+=num;
            sum=Math.max(sum,ans);
        }
       }
       return sum;
    }
}