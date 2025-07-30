class Solution {
    public int compress(char[] chars) {
        int i=0,j=0;
        ArrayList<Character>ch=new ArrayList<>();
        for (j = 0; j <= chars.length; j++) {
	            if (j == chars.length || chars[j] != chars[i]) {
	                ch.add(chars[i]); 
	                
	                int count = j - i;
	                if (count > 1) {
	                    String str = Integer.toString(count);
	                    for (char c : str.toCharArray()) {
	                        ch.add(c);
	                    }
	                }
	                i = j;
	            }
	        }
	        for(int m=0;m<ch.size();m++)
	        {
	        	chars[m]=ch.get(m);
	        }
            return ch.size();
    }
}