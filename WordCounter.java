import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordCounter {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "orange", "apple", "banana", "grape", "melon", "orange", "apple", "grape"};

        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        Set<String> uniqueWords = new HashSet<>(wordCountMap.keySet());
        System.out.println("Уникальные слова: " + uniqueWords);

        System.out.println("Количество вхождений каждого слова:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}