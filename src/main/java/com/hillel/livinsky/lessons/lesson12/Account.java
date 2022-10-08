package com.hillel.livinsky.lessons.lesson12;

public class Account {
    private final int dateOfBirth;
    private final int monthOfBirth;
    private final int yearOfBirth;
    private int age;
    private String name;
    private String email;
    private String phone;
    private String surname;
    private int weight;
    private int pressure;
    private int theNumberOfStepsTakenPerDay;

    public Account(int dateOfBirth, int monthOfBirth, int yearOfBirth, String name, String email, String phone, String surname, int weight, int pressure, int theNumberOfStepsTakenPerDay) {
        this.dateOfBirth = dateOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.theNumberOfStepsTakenPerDay = theNumberOfStepsTakenPerDay;
        this.age = 2020 - yearOfBirth;
    }
    public String getName() {
        return this.name;
    }
    public String getEmail() {
        return this.email;
    }
    public String getPhone() {
        return this.phone;
    }
    public String getSurname() {
        return this.surname;
    }
    public int getWeight() {
        return this.weight;
    }
    public int getAge() {
        return this.age;
    }
    public int getPressure() {
        return this.pressure;
    }
    public int getTheNumberOfStepsTakenPerDay() {
        return this.theNumberOfStepsTakenPerDay;
    }
    public int getDayOfBirth() {
        return this.dateOfBirth;
    }
    public int getMonthOfBirth() {
        return this.monthOfBirth;
    }
    public int getYearOfBirth() {
        return this.yearOfBirth;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
    public void setTheNumberOfStepsTakenPerDay(int theNumberOfStepsTakenPerDay) {
        this.theNumberOfStepsTakenPerDay = theNumberOfStepsTakenPerDay;
    }

    public void printAccountInfo() {
    System.out.println(this);
}

   public String toString() {
        return "AccountInfo:\n" +
                "name " + this.name + "\n" +
                "dayOfBirth " + this.dateOfBirth + "\n" +
                "monthOfBirth " + this.monthOfBirth + "\n" +
                "yearOfBirth " + this.yearOfBirth + "\n" +
                "email " + this.email + "\n" +
                "phone " + this.phone + "\n" +
                "surname " + this.surname + "\n" +
                "weight " + this.weight + "\n" +
                "pressure " + this.pressure + "\n" +
                "stepsByDay " + this.theNumberOfStepsTakenPerDay + "\n" +
                "age " + this.age + "\n";
   }
}