package cap_24_02.junit.src.src.main.java.org.example;

public class StringUtil {

    public int countVowels(String input) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : input.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
    public boolean GreaterThanLength(String input, int length) {
        return input.length() > length;
    }

    public int countWords(String input) {
        if (input == null || input.trim().isEmpty()) {
            return 0;
        }
        String[] words = input.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        StringUtil util = new StringUtil();
        String testString = "Real Madrid is the best football club in the world";
        System.out.println("Vowel count: " + util.countVowels(testString));
        System.out.println("Greater than length 5: " + util.GreaterThanLength(testString, 5));
        System.out.println("Word count: " + util.countWords(testString));
    }
}
