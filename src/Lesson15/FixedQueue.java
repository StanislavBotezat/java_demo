package Lesson15;

public class FixedQueue implements InterfaceCharQueue {

    private char q[];
    private int putloc, getloc;

    FixedQueue(int size){
        q = new char [size+1];
        putloc = getloc = 0;
        }
    FixedQueue(FixedQueue ob){
        putloc = ob.putloc;
        getloc = ob.getloc;
        q= new char [ob.q.length];
        for (int i=getloc +1; i<= putloc; i++)
            q[i] = ob.q[i];
    }

    FixedQueue(char a[]){
        putloc = getloc = 0;
        q= new char [a.length +1];
        for (int i=0 ; i<a.length; i++) {
            try {
                put(a[i]);
            } catch (QueueFullExeption e) {
                e.printStackTrace();
            }
        }
    }



    public void put(char ch) throws QueueFullExeption{
        if (putloc == q.length-1){
            throw new QueueFullExeption(q.length - 1);

        }
        putloc++;
        q[putloc] = ch;
        }
        public char get() throws QueueEmptyExeption {
        if (getloc == putloc) {
            throw new QueueEmptyExeption();
        }
        getloc++;
        return q[getloc];
        }


        void  putMultipleSymbols(int num){

        for (int i = 0; i < num; i++){
            try {
                put ((char) ('A'+i));
            } catch (QueueFullExeption e) {
                e.printStackTrace();
            }
        }

}




}
