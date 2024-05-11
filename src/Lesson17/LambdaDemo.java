package Lesson17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class LambdaDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(6);
        numbers.add(8);
        numbers.add(0);
        numbers.add(1);

        for (Integer i: numbers){
            System.out.print (i);
        }
        Iterator<Integer> it = numbers.iterator();

        while (it.hasNext()){
            Integer i = it.next();
            System.out.println(i);
        }

        show(numbers);

        Consumer<Integer> method = (n) -> { System.out.println(n);};

        numbers.forEach(method);

        StringFunction exclaim  = (s) -> (s+"!");
        StringFunction ask = (s) -> (s+"?");
        printFormatted("Hello " , exclaim);
        printFormatted("Hello " , ask);

    }

    public static void show (ArrayList<Integer> numbers ) {
        for (Integer i: numbers) {
            System.out.println(i);
        }
    }

    public static void printFormatted (String str, StringFunction f){
        String result = f.run(str);
        System.out.println(result);
    }
}
