package com.hillel.livinsky.lessons.lesson6;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        var min = 0;
        var max = 10;
        int userNumber = 0;
        int randomNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
//      System.out.println(randomNumber);

        Scanner scanner = new Scanner(System.in);
        System.out.println("You need to guess the whole number that the computer thought of a number in the range from 0 to 10 ");
        System.out.println("Enter a number from 0 to 10. You have three tries. Good Luck!");

        for (int i = 1; i < 4; i++) {
            if ((scanner.hasNextInt()) && (userNumber < 11 && userNumber >= 0)) {
                userNumber = scanner.nextInt();
                if (userNumber == randomNumber) {
                    System.out.println("You guessed the number, congratulations!");
                } else if (userNumber > randomNumber) {
                    System.out.println("You didn't guess the number, your number is larger!");
                } else if (userNumber < randomNumber) {
                    System.out.println("You didn't guess the number, your number is less!");
                }
            } else {
                System.out.println("INCORRECT DATA! RESTART THE PROGRAM AND TRY AGAIN");
                System.exit(0);
            }
        }
                System.out.println("Your trying is exhausted, try again");
    }
}




