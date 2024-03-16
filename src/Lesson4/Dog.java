package Lesson4;

public class Dog {
    String color;
    int age;
    String breed;
    boolean isFemale;
    String name;

    Dog (String color, int age, String breed,  boolean isFemale, String name){
     this.color=color;
     this.age=age;
     this.breed=breed;
     this.isFemale=isFemale;
     this.name=name;
    }
    Dog( String name){
        this.name=name.toUpperCase();
    }
    Dog(){
        name="unknown";
    }

public void PrintDogInfo(){
    System.out.println("Info about a dog named : " +name+
            "\n breed: \t"+breed+
            "\n age: \t\t"+age+
            "\n isFemale: \t"+isFemale+

            "\n color: \t" + color);
    System.out.println();
    }
}
