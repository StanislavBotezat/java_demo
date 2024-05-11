package Lesson12.series;

public class SeriesDemo {
    public static void main(String[] args) {
        ByTwos ob = new ByTwos();
        ByThrees ob2 = new ByThrees();


        for (int i = 0; i < 5; i++) {
            System.out.println("nextvalue: " + ob.getNext());
        }
        System.out.println("Reset");

        ob.reset();
        for (int i = 0; i < 5; i++) {
            System.out.println("nextvalue: " + ob.getNext());
        }

        System.out.println("Start set value 100");
        ob.setStart(100);
        for (int i = 0; i < 5; i++) {
            System.out.println("nextvalue: " + ob.getNext());
        }

        System.out.println("Previous");
        System.out.println(ob.getPrevious());


        System.out.println("ByThrees ");


        for (int i = 0; i < 5; i++) {
            System.out.println("nextvalue: " + ob2.getNext());
        }
        System.out.println("Reset");

        ob2.reset();
        for (int i = 0; i < 5; i++) {
            System.out.println("nextvalue: " + ob2.getNext());
        }

        System.out.println("Start set value 100");
        ob2.setStart(100);
        for (int i = 0; i < 5; i++) {
            System.out.println("nextvalue: " + ob2.getNext());
        }
        showSeries(5, ob2);
    }
        public static void showSeries ( int x, Series ser){
            for (int i = 0; i < x; i++) {
                System.out.println("nextvalue: " + ser.getNext());
            }
        }
    }


