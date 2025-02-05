package stringBuilder_problems;

import java.util.HashSet;
public class RemoveDuplicate {
    public static String Duplicate(String str) {

        StringBuilder b = new StringBuilder();
        HashSet<Character> flag = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (!flag.contains(ch)) {
                b.append(ch);
                flag.add(ch);
            }
        }
        return b.toString();
    }

    public static void main(String[] args) {
        String str = "programming";
        String result = RemoveDuplicate.Duplicate(str);
        System.out.println("Original String are :" + str);
        System.out.println("After removing duplicate :" + result);
    }
}
