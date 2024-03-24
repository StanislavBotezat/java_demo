package Lesson7;

public class StringBuilderStringBufferDemo {
    public static void main(String[] args) {
        int iterations = 1000000;

//        long startTimeNormal = System.currentTimeMillis();
//
//        String resultNormal = "";
//
//        for (int i = 0; i < iterations; i++){
//            resultNormal += "Iteration " + i + " ";
//
//        }
//        long endTimeNormal = System.currentTimeMillis();
//        long durationNormal = endTimeNormal - startTimeNormal;
//        System.out.println("Result String "+ resultNormal);
//        System.out.println("Time Taken without StringBuilder/Stringbuffer: "+durationNormal+"ms");
//        -------------------------



        long startTimeStringBuilder = System.currentTimeMillis();

        StringBuilder myStringBuilder = new StringBuilder();

        for (int i = 0; i < iterations; i++) {
            myStringBuilder.append("Iteration").append(i).append(" ");
                   }
        long endTimeStringBuilder = System.currentTimeMillis();
        long durationTimeStringBuilder =  endTimeStringBuilder - startTimeStringBuilder;
        System.out.println("Result String: " + myStringBuilder);
        System.out.println("Time taken with StringBuilder: "+ durationTimeStringBuilder + " ms" );
//        System.out.println("Time Taken without StringBuilder/Stringbuffer: "+durationNormal+"ms");

//        -------------------------------------



        long startTimeStringBuffer = System.currentTimeMillis();

        StringBuilder myStringBuffer = new StringBuilder();

        for (int i = 0; i < iterations; i++) {
            myStringBuilder.append("Iteration").append(i).append(" ");
        }
        long endTimeStringBuffer = System.currentTimeMillis();
        long durationTimeStringBuffer =  endTimeStringBuffer - startTimeStringBuffer;
        System.out.println("Result String: " + myStringBuffer);
        System.out.println("Time taken with StringBuffer: "+ durationTimeStringBuffer + " ms" );
//        System.out.println("Time Taken without StringBuilder/Stringbuffer: "+durationNormal+"ms");

    }
}
