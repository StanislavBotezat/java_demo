package Lesson7;

import javax.sound.midi.Soundbank;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexGroupDemo {
    public static void main(String[] args) {
        String input = "Номер заказа: 123456 Статус: оработан, Дата:2024-03-14";
        String regex = "Номер заказа: (\\d+) Статус: ([а-я]*), Дата:(\\d{4}-\\d{2}-\\d{2})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if(matcher.find()){
            String wholeMatch = matcher.group(0);
            System.out.println("Entire subtring: "+wholeMatch);
            String orderNum= matcher.group (1);
            String status = matcher.group(2);
            String date = matcher.group(3);

            System.out.println("Order number: " + orderNum);
            System.out.println("Order status: "+ status);
            System.out.println("Order date: " + date);

        }
        String EXAMPLE_TEXT = "this is an example of a text , please check is it  ? got corrected . here!";
        String pattern1= "(\\w)(\\s+)([\\.,\\?\\!])";
        String midifiedString = EXAMPLE_TEXT.replaceAll(pattern1, "$1$3");
        System.out.println(midifiedString);

        String EXAMPLE_TEXT_1 = "This is my small example of a string which I'm going to use for pattern matching.";
        System.out.println("Is this string empty?" + EXAMPLE_TEXT_1.matches("\\w.+"));
        System.out.println("Is this string empty?" + (EXAMPLE_TEXT_1.length()>0));

        String[] splitString = EXAMPLE_TEXT_1.split("\\s+");
        System.out.println("Number of substrings after splitting:"+splitString.length);

        for ( String substring : splitString) {
            System.out.println(substring);
        }
        System.out.println(EXAMPLE_TEXT_1.replaceAll("\\s+","\t"));


    }
}
