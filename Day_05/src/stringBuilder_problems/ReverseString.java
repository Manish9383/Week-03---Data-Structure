package stringBuilder_problems;

public class ReverseString {
    public static void main(String[] args) {
        StringBuilder b= new StringBuilder(" ");
        b.append("hello");
        b.reverse();
        b.toString();
        System.out.println("Reversed String are :"+b);
    }
}
