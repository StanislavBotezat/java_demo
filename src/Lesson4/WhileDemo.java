package Lesson4;

public class WhileDemo {
    public static void main(String[] args) {
//            while (condition){
//                some code
//            }
    char ch;
    ch='a';
    while(ch<='z'){
        System.out.print(ch);
        ch++;
         }
        System.out.println();
        System.out.println(" the loop");

    for(ch='a';ch<='z';ch++){
        System.out.print( ch);
    }



        System.out.println();
    int e;
    int result;
    for (int i=0; i<10; i++){
        result=1;
        e=i;
        while (e>0){
            result*=2;
            e--;

        }
        System.out.println("2 in the pewer " + i+" is equal to  " +result );
    }
    }


}
