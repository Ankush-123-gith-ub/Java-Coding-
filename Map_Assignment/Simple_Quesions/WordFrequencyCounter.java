
import java.util.*;
public class WordFrequencyCounter {
    public static void main(String[] args) {
        String text = "Hello world, hello Java!";
        text = text.toLowerCase().replaceAll("[^a-z ]", "");
        String[] words = text.split(" ");
        Map<String, Integer> countMap = new HashMap<>();
        for (String word : words) {
            if (word.isEmpty()) continue;
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        }
        System.out.println(countMap);
    }
}
