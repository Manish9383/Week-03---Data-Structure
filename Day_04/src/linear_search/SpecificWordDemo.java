package linear_search;

import java.util.Scanner;
public class SpecificWordDemo {
    public static String Specific(String[] str, String word) {
        for (int i = 0; i < str.length; i++) {
            if (str[i].contains(word)) {
                return str[i];
            }
        }
        return "not found";
    }

    public static void main(String[] args) {
        String[] str ={
                "Java is a powerful language ",
                "C++ follows OOPS principle",
                "Python is used to train the models"
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String words = sc.nextLine();
        String result = Specific(str, words);
        System.out.println(result);
    }
}
