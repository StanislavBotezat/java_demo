package Lesson15;

import Lesson14.Dog;

public class QDemo {
    public static void main(String[] args) {
        FixedQueue bigQ = new FixedQueue(100);
        FixedQueue smallQ = new FixedQueue(100);
        FixedQueue test = new FixedQueue(100);

        char ch;
        int i;

        InterfaceCharQueue interfaceTypeObj;

        interfaceTypeObj = bigQ;
        System.out.println("BigQ");
        putMultipleSymbols(interfaceTypeObj, 10);
        getMultipleSymbols(interfaceTypeObj,10);

        System.out.println("SmallQ");
        interfaceTypeObj = smallQ;

        putMultipleSymbols(interfaceTypeObj, 25);
        getMultipleSymbols(interfaceTypeObj,25);

        System.out.println("testQ");
        interfaceTypeObj = test;

        putngetMultipleSymbols(interfaceTypeObj, 25);





        System.out.println("Try to print object of a class");



//        int arg = 67;
//        bigQ.putMultipleSymbols(67);
//
//
//        System.out.println("Использование очереди bigQ для сохраниения алфавита");
//        for (i = 0; i < 26; i++)
//            bigQ.put((char) ('A' + i));
//
//        System.out.println(" Содержимое очереиди bigQ: ");
//        for (i = 0; i < 26; i++) {
//            ch = bigQ.get();
//            if (ch != (char) 0) System.out.print(ch);
//        }
//        System.out.println("\n");
//
//        System.out.println("Использование очереди smallQ для генерации ошибок");
//        for (i = 0; i < 5; i++) {
//            System.out.println("попытка сохранения " + (char) ('Z' - i));
//            smallQ.put((char) ('Z' - i));
//            System.out.println();
//        }
//
//        System.out.print("Содержимое smallQ: \n");
//
//        for (i = 0; i < 5; i++) {
//            ch = smallQ.get();
//            if (ch != (char) 0) System.out.println(ch);
//        }
//        System.out.println("Fill cirque");
//        CircularQueue circQueueObj = new CircularQueue(1);
//        for (i = 0; i < 1; i++) {
//            circQueueObj.put((char) ('A' + i));
//
//        }
//        System.out.println("Show cirque");
//        for (i = 0; i < 1; i++) {
//            ch = circQueueObj.get();
//            if (ch != (char) 0) System.out.println(ch);
//        }
//
//        System.out.println("Put and get from cirqueue");
//
//        for (i = 0; i < 100; i++) {
//            circQueueObj.put((char) ('A' + i));
//            ch = circQueueObj.get();
//            System.out.print(ch);
//        }
//
//        System.out.println("Put and get from Dynamiqueu");
//
//        DynamicQueue dynQueueObj = new DynamicQueue(5);
//        System.out.println("Fill dinamiq");
//        for (i = 0; i < 50; i++) {
//            dynQueueObj.put((char) ('A' + i));
//        }
//
//        System.out.println("Show cirque");
//        for (i = 0; i < 30; i++) {
//            ch = dynQueueObj.get();
//            if (ch != (char) 0) System.out.print(ch);
//        }
//        test.q[0]=99;
//        test.putloc  = -100;




    }


    static void putMultipleSymbols(InterfaceCharQueue obj, int num) {
        for (int i = 0; i < num; i++) {
            try {
                obj.put((char) ('A' + i));
            } catch (QueueFullExeption e) {
                throw new RuntimeException(e);
            }
        }
    }
    static void getMultipleSymbols(InterfaceCharQueue obj, int num) {
        for (int i = 0; i < num; i++) {
            char ch = 0;
            try {
                ch = obj.get();
            } catch (QueueEmptyExeption e) {
                throw new RuntimeException(e);
            }
            if (ch != (char) 0) System.out.print(" "+ ch);
        }
    }

    static void putngetMultipleSymbols(InterfaceCharQueue obj, int num) {

        System.out.println("Putting and getting " + num  + " " + " characters from " + obj.getClass() + " :");
        for (int i = 0; i < num; i++) {
            try {
                obj.put((char) ('A' + i));
            } catch (QueueFullExeption e) {
                throw new RuntimeException(e);
            }
        }
            for (int i = 0; i < num; i++) {
                char ch = 0;
                try {
                    ch = obj.get();
                } catch (QueueEmptyExeption e) {
                    throw new RuntimeException(e);
                }
                if (ch != (char) 0) System.out.print(" "+ ch);}
    }
}
