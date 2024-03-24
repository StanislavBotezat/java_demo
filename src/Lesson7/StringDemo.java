package Lesson7;

import java.util.SortedMap;

public class StringDemo {
    public static void main(String[] args) {
        String str0 = new String("Hello");
        String str1 = "Hello";
        String str2 = new String(str0);
        String myStr0 = "apple";
        String myStr1 = "banana";
        String complexString = "One two three One";
        char [] myCharArray = {'H','E','L','L','O'};
        int a=0,b = 0;
        Integer myA = a;

        for (char c : myCharArray) {
            System.out.println(c);
        }
        System.out.println(str0);
        System.out.println(str1);
        System.out.println(str2);

        // нельзя сравнивать как примитивы т.к. это объекты
        System.out.println(str0==str2);
// для сравнения объектов используется .equals()
        System.out.println("Equals:"+str0.equals(str1));
        System.out.println("Compare to: " +str0.compareTo(str1));
        System.out.println("Compare to: " +myStr1.compareTo(myStr0));
        System.out.println("Index of first occuranse One "+ complexString.indexOf("One"));
        System.out.println("Index of first occuranse One "+ complexString.lastIndexOf("One"));
        System.out.println("Upper case "+complexString.toUpperCase());
        System.out.println("Lower case "+ complexString.toLowerCase());
        String upCase = complexString.toUpperCase();
        String lowCase = complexString.toLowerCase();
        System.out.println("Equals Ignore case:" + upCase.equals(lowCase));



        System.out.println("");



        System.out.println(a==b);


        System.out.println("str1 length is " + str1.length());
        for (int i = 0; i < str1.length(); i++) {
            System.out.println( "str1.charAt("+i+"):"+str1.charAt(i));
      }
    }
}
