package ExecMod4;

import java.io.IOException;

public class SqArea {
    public static void main(String[] args) throws IOException {
        for (;;) {
            SqAreaMod rectangle = new SqAreaMod();
            rectangle.enterVal();
            rectangle.areaOfRect();
            if (rectangle.stop()) break;
        }
    }
}
