package Lesson16;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> integerDeque = new LinkedBlockingDeque<>(5);

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0 ?
            integerDeque.offerLast(i) : integerDeque.offerFirst(i))
                System.out.println("the integerDeque is not full yet " + i + "was inserted");



        }
    }
}
