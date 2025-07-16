class Solution {
    public int countDigits(int num) {
        int n = num;
        int ans = 0;
        while(num>0){
            int rem = num%10;
            if(n%rem==0)
                ans+=1;
            num/=10;
        }
        return ans;
        
    }
}