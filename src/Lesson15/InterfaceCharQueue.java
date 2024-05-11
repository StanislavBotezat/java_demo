package Lesson15;

public interface InterfaceCharQueue {

    void put (char ch) throws QueueFullExeption;
    char get() throws QueueEmptyExeption;

}
