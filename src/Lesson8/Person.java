package Lesson8;

public class Person {
    public String name;
    private int age;

    Person(String name, int age){
        this.name   = name;
        this.age = age < 18 ? 0: age;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age < 18 ? 0 : age;
    }
}
