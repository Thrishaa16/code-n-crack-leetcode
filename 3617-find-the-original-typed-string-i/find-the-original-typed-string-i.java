class Solution {
    public int possibleStringCount(String word) {
        int total_ways = 1;  // No mistake case
        int index = 0;
        int count = 1;       

        while (index < word.length() - 1) {
            char current_char = word.charAt(index);
            if (current_char == word.charAt(index + 1)) {
                count++;
            } else {
                if (count >= 2) {
                    total_ways += (count - 1);
                }
                count = 1;  // Reset count for the next group
            }
            index++;
        }

        // Handle the last group (if it ends with repeated characters)
        if (count >= 2) {
            total_ways += (count - 1);
        }

        return total_ways;
    }
}
