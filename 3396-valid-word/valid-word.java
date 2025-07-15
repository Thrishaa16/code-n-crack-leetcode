class Solution {
    public boolean isValid(String word) {
        int c1=0,c2=0;
        ArrayList<Character> al = new ArrayList<>(Arrays.asList('a','e','i','o','u'));
        int n = word.length();
        if(n<3)return false;
        word = word.toLowerCase();
        for(Character c : word.toCharArray()){
            if(c>=97 && c<=122){
                if(al.contains(c))
                    c1=1;
                else
                    c2=1;
            }  
            if(c==64 || c==36|| c==35)return false;
        }
        if(c1==0 || c2==0)return false;

        return true;
    }
}