package Lesson7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpDemo {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile ("\s[a-z]{6}!", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Welcome to StepIt!");
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found");
        }else{
            System.out.println("Match not found");
        }

        System.out.println(Pattern.matches("[a-zA-z0-9]{6}", "aRun32"));
        System.out.println(Pattern.matches("[a-zA-z0-9]{6}", "aRun%2"));
        System.out.println(Pattern.matches("[a-zA-z0-9]{6}", "aRun32traq"));
        System.out.println(Pattern.matches("[789]\\d{9}", "71234567890"));
        System.out.println(Pattern.matches("[789]{2}\\d{9}", "71234567890"));
    }

}
