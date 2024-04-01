package Lesson8;

import java.util.Scanner;

public class TernaryOperationDemo {
    public static void main(String[] args) {
//        if (condition) <code>
//                else <code>
int result;
for (int i = -5; i <6; i++){
    if (i!=0) result =100/i;
    else result = 0;
    // короткая форма
    result = (i!=0) ? (100/i ) : 0;

    System.out.println("100/ " + i+ " is equal to "+ result);

}

String answer;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = in.nextInt();

        if(a>0) answer = "a is greater then 0";
        else answer = "a is greater than zero";

        answer = a>0? "a is greater then 0" : "a is greater than zero";
        System.out.println(answer);


    }
}
