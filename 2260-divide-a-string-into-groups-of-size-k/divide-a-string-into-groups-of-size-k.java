class Solution {
    public String[] divideString(String s, int k, char fill) {
        
        while(s.length()%k!=0){
            s+=fill;
        }
        int parts = s.length() / k;
        String[] ch = new String[parts];
        for(int i=0;i<s.length();i+=k){
            ch[i/k] = s.substring(i,i+k);
        }
        return ch;
    }
}