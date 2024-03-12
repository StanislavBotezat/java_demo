package Lesson3;

public class Switch {
    public static void main(String[] args) {
//        switch (){
//            case constant1:
//                some code
//                        break;
//            case constant2:
//                some code
//                break;
//            case constant3:
//                some code
//                break;
//            default:
//                some code
//        }
        int i;
        for (i=0; i<10; i++) {
            switch (i) {
                case 0 -> System.out.println("i=0");
                case 1 -> System.out.println("i=1");
                case 2 -> System.out.println("i=2");
                case 3 -> System.out.println("i=3");
                case 4 -> System.out.println("i=4");
                default -> System.out.println("i>=5");
            }
        }



    }
}
