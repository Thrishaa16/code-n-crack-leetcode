class Solution {
    public String makeFancyString(String s) {
        int count = 1;  // Start from 1 because first char always counts
        StringBuilder result = new StringBuilder();
        char[] ch = s.toCharArray();
        result.append(ch[0]);
        for (int i = 1; i < ch.length; i++) {
            if (ch[i] == ch[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count < 3) {
                result.append(ch[i]);
            }
        }
        return result.toString();
    }
}
