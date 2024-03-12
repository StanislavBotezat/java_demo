package Lesson4;

public class ForVar {
    public static void main(String[] args) {
        int sum=0;
        int fact =1;
        for (int i=1; i<=5; i++){
            System.out.println("Current i is eq:" +i);
            sum+=i;
            System.out.println("current sum is eq: "+sum);
            fact*=i;
            System.out.println("Current fact is eq: "+fact);

           }
        System.out.println("sum is equal to "+sum);
        System.out.println("fact is equal to "+fact);
    }


}
