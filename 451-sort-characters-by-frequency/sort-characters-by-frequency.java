class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch: s.toCharArray())
            map.put(ch,map.getOrDefault(ch,0)+1);
        ArrayList<Character> chars = new ArrayList<>(map.keySet());
        Collections.sort(chars,(a,b)-> map.get(b)-map.get(a));
        String res = "";
        for(char ch : chars){
            int freq = map.get(ch);
            for(int i=0;i<freq;i++)
                res+=ch;
        }
        return res;
    }
}