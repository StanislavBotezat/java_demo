package Exercise;

public class ForDemo {
    public static void main(String[] args) {
        int count;
        for (count = 0; count<5; count=count+1);
        System.out.println("Значение счетчика : " + count);
        System.out.println("Готово");
        count=0;
        for (count = 0; count<5; count++);
        System.out.println("Значение счетчика : " + count);
        System.out.println("Готово");
    }
}
