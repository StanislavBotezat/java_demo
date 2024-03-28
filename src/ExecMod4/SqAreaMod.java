package ExecMod4;

import java.io.IOException;
import java.util.Scanner;

public class SqAreaMod {
  float sideA; float sideB;


  public void enterVal(){
      Scanner i=new Scanner (System.in);
      System.out.println("введите значение стороны прямоугольника A");
      sideA=i.nextFloat();
      System.out.println("введите значение стороны прямоугольника B");
      sideB=i.nextFloat();
  }

  public float areaOfRect(){
      float ar=sideA*sideB;
      System.out.println("Площадь прямоугольника = " +ar);
      return ar;
  }

  public boolean stop() throws IOException {
      System.out.println("для отсановки нажмите q и любую клавишу чтобы продолжить");
      boolean stop = false;
        char ch;
      ch =  (char) System.in.read();
      if (ch =='q'| ch=='Q')
          stop = true;
          return stop;
  }
}
