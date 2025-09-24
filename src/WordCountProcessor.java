import java.io.*;
import java.util.*;

class WordCountProcessor implements LineProcessor {
    private List<HashMap<String, Integer>> lineWordCounts = new ArrayList<>();

    @Override
    public void processLine(String line, int lineNumber) {
        HashMap<String, Integer> wordCount = new HashMap<>();
        String[] words = line.split("\\s+"); // 依空白切詞
        for (String word : words) {
            word = word.toLowerCase().replaceAll("[^a-z0-9_]", ""); // 簡單清理符號
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        lineWordCounts.add(wordCount);

        // 範例輸出
        System.out.println("Line " + lineNumber + ": " + wordCount);
    }

    public List<HashMap<String, Integer>> getLineWordCounts() {
        return lineWordCounts;
    }
}