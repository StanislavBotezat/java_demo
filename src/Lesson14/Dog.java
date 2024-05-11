package Lesson14;

public class Dog {
    String name;
    boolean isCollarPuton;
    boolean isLeashPuton;
    boolean isMuzzlePuton;

    public Dog(String name){
        this.name = name;
    }
    public void putCollar(){
        System.out.println("The collar os on");
        isCollarPuton = true;
    }

    public void putLeash(){
        System.out.println("The collar os on");
        isLeashPuton = true;
    }

    public void putMuzzle(){
        System.out.println("The collar os on");
        isMuzzlePuton = true;
    }

    public void walk() throws DogIsNotReadyExeption {
        if (isCollarPuton && isLeashPuton && isMuzzlePuton) {
            System.out.println("Great, lets go " + name + " is happy");
        } else {
            throw new DogIsNotReadyExeption ("The dog " + name + " is not ready");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Booy");
        dog.putCollar();
        dog.putLeash();
        try {
            dog.walk();
        } catch (DogIsNotReadyExeption e) {
            e.printStackTrace();
            System.out.println(" Check everithing! \nIs collar on " + dog.isCollarPuton +
                                                    "\n Is Leash on " + dog.isLeashPuton +
                                                    "\n Is Muzzle on " + dog.isMuzzlePuton);
        }
    }
}
