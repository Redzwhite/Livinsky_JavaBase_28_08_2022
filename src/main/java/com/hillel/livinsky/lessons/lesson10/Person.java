package com.hillel.livinsky.lessons.lesson10;

public class Person {
    public static String personInfo(String firstName,String lastName,String city,String phoneNumber) {
        String person = new String("Зателефонувати громадянину " + firstName + "" + lastName + " із міста " + city + " можна за номером " + phoneNumber + ".");
        System.out.println(person);
        return person;
    }

    public static void main(String[] args) {
     personInfo("Will","Smith","New York","2936729462846");
     personInfo("Jackie","Chan","Shanghai","12312412412");
     personInfo("Sherlock","Holmes","London","37742123513");
    }
}
