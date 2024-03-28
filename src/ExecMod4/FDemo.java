package ExecMod4;

public class FDemo {
    int x;
    FDemo(int i) {
        x = i;
        }

    /**
     * @throws Throwable
     */
        @Override
        protected void finalize()  throws Throwable {
            System.out.println("Финализация " + x);
            }
            void generator (int i){
        FDemo o = new FDemo(i);

            }
}
