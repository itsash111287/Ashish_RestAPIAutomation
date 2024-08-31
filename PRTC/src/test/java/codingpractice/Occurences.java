package codingpractice;

import java.util.HashMap;
import java.util.Map;

public class Occurences {
    public static void main(String[] args) {
        String str = "Nayar";
        char maxChar = findMaxOccurrenceChar(str);
        System.out.println("Character with max occurrence: " + maxChar);
        
        
    }

    public static char findMaxOccurrenceChar(String str) {
        // Convert the string to lowercase to handle case insensitivity
        str = str.toLowerCase();

        // Create a HashMap to store character frequencies
        Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        // Traverse the string and count the frequency of each character
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find the character with the maximum frequency
        char maxChar = ' ';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxChar = entry.getKey();
                maxCount = entry.getValue();
                System.out.println(maxCount);
            }
        }

        return maxChar;
       }
}
	
	
	


