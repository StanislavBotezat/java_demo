package Lesson13;

public class QueueDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);


        char ch;
        int i;

        System.out.print (" Using big Q to store aplhabet");
        for (int j = 0; j < 26; j++) {
            bigQ.put ((char)('A'+j));
        }

        System.out.print (" Using big Q to store aplhabet");
        for (int j = 0; j < 26; j++) {
           ch =  bigQ.get ( );
           if (ch != (char)0) System.out.print(ch);
        }

        System.out.println();

        System.out.print (" Using small Q to store aplhabet");
        for (int j = 0; j < 5; j++) {
            smallQ.put ((char)('A'+j));
        }
        Queue clonedQ = new Queue(smallQ);
        System.out.println();

        System.out.print (" Show Cloned Queue");
        for (int j = 0; j < 5; j++) {
            ch= clonedQ.get();
            if (ch != (char)0) System.out.println(ch);
        }


        System.out.print (" Using small Q to store aplhabet");
        for (int j = 0; j < 5; j++) {
            ch =  smallQ.get ( );
            if (ch != (char)0) System.out.print(ch);
        }

    }





}
