package stringBuffer_problems;

public class ConcatenateStrings {
    public static String concatenateStrings(String[] words) {
        StringBuffer sb = new StringBuffer();

        for (String word : words) {
            sb.append(word);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String[] words = {"Hello", " ", "World", "!", " My", " Manish ", "Patel"};
        String result = concatenateStrings(words);
        System.out.println("Concatenated String: " + result);
    }
}
