package Lesson15;

public class QueueFullExeption extends Exception {

    int size;
    QueueFullExeption(int s){
        size = s;
    }

    @Override
    public String toString() {
        return "Queue Empty Exeption";


    }
}
