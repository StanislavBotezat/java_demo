package ExecMod4;

public class Finalize {
    public static void main(String[] args) throws Throwable {
        int count;

        FDemo ob = new FDemo(0);


        for (count=1; count <100000; count++){
            ob.generator(count);
        ob.finalize();
        }
    }
}
