package Lesson13;

public class Queue {

    char [] q;
    int putloc; int getloc;

    Queue ( int size ){
        q = new char [size + 1];
        putloc  = getloc = 0;

    }


    Queue (Queue obj){
        putloc = obj.putloc;
        getloc = obj.getloc;
        q = new char [obj.q.length];

        for (int i = getloc + 1;  i <= putloc; i++) {
            q[i] = obj.q[i];
        }
    }


    void put (char ch){
        if (putloc == q.length - 1) {
            System.out.println("The queue is full!");
            return;
                    }
        putloc++;
        q[putloc] = ch;
    }


    char get (){
        if (getloc == putloc) {
            System.out.println("The queue is Empty");
            return (char ) 0;
        }
        getloc++;
        return q[getloc];

    }


}
