class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        char[] mg = magazine.toCharArray();
        char[] rn = ransomNote.toCharArray();
        for(int i = 0;i<rn.length;i++){
            boolean found = false;
            for(int j = 0;j<mg.length;j++){
                if(rn[i]==mg[j]){
                    mg[j]='*';
                    found = true;
                    break;
                }
            }
            if(!found)return false;
        }
        return true;
    }
}