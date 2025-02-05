package stringBuffer_problems;

public class CompareString {
    public static void main(String[] args) {
       String text="Manish";
       StringBuffer buffer= new StringBuffer();
       StringBuilder builder=new StringBuilder();
       int iteration= 1000000;
       //iteration for buffer;
        long startTime1= System.nanoTime();
        for(int i=0;i<iteration;i++)
        {
            buffer.append(text);
        }
        long endTime1=  System.nanoTime();
        long bufferTime= endTime1-startTime1;

        //iteration for builder;

        long startTime2 =System.nanoTime();
        for(int i=0;i<iteration;i++)
        {
            builder.append(text);
        }
        long endTime2=System.nanoTime();
        long builderTime= endTime2-startTime2;


        System.out.println("Time taken by StringBuffer is :"+bufferTime/1000000+" ms");
        System.out.println("Time taken by StringBuilder is :"+builderTime/1000000+" ms");

        if(bufferTime>builderTime)
        {
            System.out.println("StringBuffer is faster then StringBuilder by :"+(bufferTime - builderTime)/1000000+ " ms");
        }
        else {
            System.out.println("StringBuilder is faster then StringBuffer by :"+(builderTime- bufferTime)/1000000+" ms");

        }



    }
    }
