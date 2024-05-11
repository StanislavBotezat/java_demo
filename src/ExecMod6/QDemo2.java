package ExecMod6;

public class QDemo2 {

    public static void main(String[] args) {

        Queue q1 = new Queue(10);
        char name [] = {'T', 'o', 'M'};

        Queue  q2 = new Queue(name);
        char ch;
        int j;

        for (j=0; j<10 ; j++ )
            q1.put((char) ('A'+j));

        Queue q3 = new Queue(q1);

        System.out.println("Показать содержимое очереди q1: ");
        for ( j = 0; j < 10 ; j++) {
            ch = q1.get();
            System.out.print(ch);
        }
        System.out.println();
        System.out.println("Показать содержимое очереди q2: ");
        for (  j = 0; j < 3; j++) {
            ch = q2.get();
            System.out.println(ch);
             }
        System.out.println("Показать содержимое очереди q3: ");

        for (j = 0; j<10 ; j++) {
            ch = q3.get();
            System.out.print(ch);
        }
    }
}
