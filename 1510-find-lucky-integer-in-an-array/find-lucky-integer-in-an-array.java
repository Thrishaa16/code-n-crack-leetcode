import java.util.HashMap;

public class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int luckyNumber = -1;
        
        for (int key : frequencyMap.keySet()) {   // keySet() used to create a set out of the key elements contained in the hash map.
            if (key == frequencyMap.get(key)) {
                luckyNumber = Math.max(luckyNumber, key);
            }
        }

        // Return the largest lucky number, or -1 if none is found
        return luckyNumber;
    }
}
