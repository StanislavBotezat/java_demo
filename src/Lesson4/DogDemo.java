package Lesson4;

public class DogDemo {
    public static void main(String[] args) {

        Dog myDog0 = new Dog( );
        Dog myDog1 = new Dog("black",10, "labrador",true,"Alia");
        Dog myDog3 = new Dog("Pale",2, "labrador",true,"Asia");
        Dog myDog4 = new Dog("Margo");

        myDog0.PrintDogInfo();
        myDog1.PrintDogInfo();
        //myDog2.PrintDogInfo();
        myDog3.PrintDogInfo();
        myDog4.PrintDogInfo();


    }
}
