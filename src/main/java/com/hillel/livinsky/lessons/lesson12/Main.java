package com.hillel.livinsky.lessons.lesson12;

public class Main {
    public static void main(String[] args) {
        Account user1 = new Account(10,24,1989,"Bob","Red@gmail.com,","050421111","Ra",148,55,1299);
        Account user2 = new Account(11,22,1999,"Rob","Redz@gmail.com,","050221111","Ba",158,35,1399);
        Account user3 = new Account(12,21,1959,"Don","Req@gmail.com,","050421211","Wa",167,78,15444);
        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();

        user1.setWeight(130);
        user2.setTheNumberOfStepsTakenPerDay(1433);

        user1.printAccountInfo();
        user2.printAccountInfo();


    }
}