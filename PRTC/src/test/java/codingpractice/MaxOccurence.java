package codingpractice;

public class MaxOccurence {
    public static void main(String[] args) {
        String str = "Nayar";
        char maxChar = findMaxOccurrenceChar(str);
        System.out.println("Character with max occurrence: " + maxChar);
    }

    public static char findMaxOccurrenceChar(String str) {
        // Convert the string to lowercase to handle case insensitivity
        str = str.toLowerCase();

        // Create an array to store the frequency of each character
        int[] charCount = new int[256]; // Assuming ASCII characters

        // Traverse the string and count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }

        // Find the character with the maximum frequency
        char maxChar = ' ';
        int maxCount = 0;
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > maxCount) {
                maxCount = charCount[i];
                maxChar = (char) i;
            }
        }

        return maxChar;
    }
}
