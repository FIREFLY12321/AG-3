import java.io.*;
import java.util.*;
public class VaccineTweetAnalyzer {
    public static void main(String[] args) {
        String fileName = "C:/javaProgram/hw1/out/production/hw1/vaccine_tweets.txt";
        WordCountProcessor processor = new WordCountProcessor();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineNumber = 1;
            while ((line = br.readLine()) != null) {
                processor.processLine(line, lineNumber);
                lineNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 如果之後要使用 HashMap 結果
        List<HashMap<String, Integer>> results = processor.getLineWordCounts();
        // 可以再做更多處理，例如存檔或分析
    }
}
/*


hello
hello1


test

 */