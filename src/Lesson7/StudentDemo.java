package Lesson7;

public class StudentDemo {
    public static void main(String[] args) {
        Student one = new Student("Aliosha", 10);
        one.addGrade(0,6);
        one.addGrade(1,7);
        System.out.println(one.avgCalc());
        System.out.println(one.maxGrade());
    }
}
