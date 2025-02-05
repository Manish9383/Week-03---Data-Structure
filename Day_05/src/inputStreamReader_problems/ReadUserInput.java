package inputStreamReader_problems;

import java.io.*;
public class ReadUserInput{
    public static void main(String[] args) {
        String fileName = "user_inputText.txt";

        try {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);

            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            FileWriter fileWriter = new FileWriter(fileName, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String userInput;
            System.out.println("Enter text to write to the file. Type 'exit' to stop.");

            while (!(userInput = bufferedReader.readLine()).equalsIgnoreCase("exit")) {
                bufferedWriter.write(userInput);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            bufferedReader.close();
            inputStreamReader.close();
            fileWriter.close();

            System.out.println("Input written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

