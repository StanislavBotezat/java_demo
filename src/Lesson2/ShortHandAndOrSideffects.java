package Lesson2;

public class ShortHandAndOrSideffects
{
    public static void main(String[] args) {
        int i;
        i=0;
        if (false && (++i<100))
            System.out.println("this string won't be displayed.");
        System.out.println("the operator was executed: " +i);

    }
}
