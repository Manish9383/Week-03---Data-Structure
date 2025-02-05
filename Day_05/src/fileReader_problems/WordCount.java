package fileReader_problems;
import java.io.*;
public class WordCount{
    public static void main(String[] args) {
        String fileName = "src/example.txt";
        String targetWord = "patel";
        int wordCount = 0;

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\s+"); // Split by the whitespace

                for (String word : words) {
                    word = word.replaceAll("[^a-zA-Z]", "");
                    if (word.equalsIgnoreCase(targetWord)) {
                        wordCount++;
                    }
                }
            }

            // Closing the file
            bufferedReader.close();
            fileReader.close();

            System.out.println("The word '" + targetWord + "' appears " + wordCount + " times in the file.");
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
