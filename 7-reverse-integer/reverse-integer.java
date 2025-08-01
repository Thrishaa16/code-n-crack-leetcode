class Solution {
    public int reverse(int x) {
        int z=x;
        if(x<0){
            x=x*-1;
        }
        int rev=0;
        while(x>0){
           int rem=x%10;

           if(rev>(Integer.MAX_VALUE-rem)/10) {
                return 0;
            }

           rev=rev*10+rem;
           x=x/10;
        }
        if(z<0){
            rev=rev*-1;
        }
        return rev;
    }
}
