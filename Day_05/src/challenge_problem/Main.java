package challenge_problem;

public class Main {
    public static void main(String[] args) {
        long bufferTime=StringBufferTime.bufferTime();
        long builderTime=StringBuilderTime.builderTime();

        System.out.println("Time taken by StringBuffer to concatenate 1 million strings :"+bufferTime+" ns");
        System.out.println("Time taken by StringBuilder to concatenate 1 million strings :"+builderTime+" ns");

        long readingTime=ReadFile.reader();
        System.out.println("Time taken to read the file: "+readingTime+" ns");
        System.out.println(ReadFile.count);
    }

}
