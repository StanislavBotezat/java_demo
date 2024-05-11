package Lesson16;

public class Patient implements Comparable<Patient> {
    String name;
    int age;

    Severity severity;

    Patient(String name, int age, Severity severity){
    this.name = name;
    this.age = age;
    this.severity = severity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int getSeverityScore(){
        return severity.getScore();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Severity getSeverity() {
        return severity;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", severity=" + severity +
                '}';
    }

    @Override
    public int compareTo(Patient o) {
        if (getSeverityScore()> o.getSeverityScore()) return 1;
        else if(getSeverityScore() <o.getSeverityScore())return -1;
//        return 0;
//        if (getAge() > o.getAge()) return 1;
//        else if (getAge() <o.getAge()) return -1;
        return Integer.compare(getAge(), o.getAge());
    }
}

