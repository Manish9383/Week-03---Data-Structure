package challenge_problem;

import java.io.*;

public class ReadFile {
    public static int count=0;
    public static long reader() {
        long startTime=0,endTime=0;
//           int count=0;
        StringBuffer sb=new StringBuffer();
        try(BufferedReader br=new BufferedReader(new FileReader("sampleFile.txt"))){
            String line;
            startTime=System.nanoTime();
            while((line=br.readLine())!=null){
                sb.append(line).append(" ");
            }
            String temp=sb.toString();
            String [] words=temp.split("\\s+");

            for(String string:words){
                count++;
            }
            endTime=System.nanoTime();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return endTime-startTime;
    }
}
