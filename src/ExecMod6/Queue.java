package ExecMod6;

public class Queue {

    private char q[];
    private int putloc, getloc;

    Queue( int size){
        q = new char [size+1];
        putloc = getloc = 0;
        }
    Queue (Queue ob){
        putloc = ob.putloc;
        getloc = ob.getloc;
        q= new char [ob.q.length];
        for (int i=getloc +1; i<= putloc; i++)
            q[i] = ob.q[i];
    }

    Queue (char a[]){
        putloc = getloc = 0;
        q= new char [a.length +1];
        for (int i=0 ; i<a.length; i++) put(a[i]);
    }



    void put (char ch){
        if (putloc == q.length-1){
            System.out.println(" Очередь заполнена.");
            return;
        }
        putloc++;
        q[putloc] = ch;
        }
        char get (){
        if (getloc == putloc) {
            System.out.println(" Очередь пуста.");
        }
        getloc++;
        return q[getloc];
        }

}
