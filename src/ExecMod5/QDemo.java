package ExecMod5;

public class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(5);
        char ch;
        int i;

        System.out.println("Использование очереди bigQ для сохраниения алфавита");
        for (i=0; i < 26; i++)
            bigQ.put((char) ('A'+i ));

        System.out.println(" Содержимое очереиди bigQ: ");
        for (i=0; i<26; i++){
            ch = bigQ.get();
            if(ch!=(char) 0 ) System.out.print(ch);
        }
        System.out.println("\n");

        System.out.println("Использование очереди smallQ для генерации ошибок");
        for (i=0; i<5; i++){
            System.out.println("попытка сохранения " + (char) ('Z'-i));
            smallQ.put((char) ('Z'-i));
            System.out.println();
        }

        System.out.print("Содержимое smallQ: \n");
        for (i=0; i<5;i++){
            ch = smallQ.get();
            if (ch != (char) 0) System.out.println(ch);
        }
    }
}
