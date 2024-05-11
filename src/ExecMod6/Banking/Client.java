package ExecMod6.Banking;

import java.util.ArrayList;

public class Client {

    private String name;
    private String lastName;
    private String gender;
    private byte dateOfBirth;
    private byte monthOfBirth;
    private short yearOfBirth;
    private int id;



    public enum Gender{
        MALE,
        FEMALE,
        UNKNOWN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public byte getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(byte dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public byte getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(byte monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public short getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(short yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client() {

    }

    @Override
    public String toString() {
                return  "Клиент " + '\t' +
                "Имя: " + name + '\t' +
                "Фамилия: " + lastName + '\t' +
                "Пол: " + gender + '\t' +
                "ДД-ММ-ГГГГ рождения: " + dateOfBirth +
                "-" + monthOfBirth +
                "-" + yearOfBirth + '\t'+
                "id: " + id +
                "\n";
    }

    public Client (String name,
                   String lastName,
                   String gender,
                   byte dateOfBirth,
                   byte monthOfBirth,
                   short yearOfBirth,
                   int id){
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.id = id;

    }


}
