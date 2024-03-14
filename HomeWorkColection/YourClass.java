package Debt.HomeWorkColection;

import java.util.HashMap;
import java.util.Map;

public class YourClass {
    public static Map<Character, Integer> getCharsCount(String s) {
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        return charCount;
    }

    public static void main(String[] args) {
        String inputString = "baaccc";
        Map<Character, Integer> result = getCharsCount(inputString);

        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            System.out.println("'" + entry.getKey() + "' - " + entry.getValue());
        }
    }
}
