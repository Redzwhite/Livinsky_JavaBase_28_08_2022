package com.hillel.livinsky.lessons.lesson6;

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        int minValue = 0;
        int maxValue = 0;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number from which to start calculating the shuttles");
        minValue = scanner.nextInt();

        System.out.println("Please enter the number from which to finish the calculation of the shuttles");
        maxValue = scanner.nextInt();

        for (int i = minValue; i < maxValue; i++) {
            String s = String.valueOf(i);

            if (s.contains("4") || s.contains("9")) {
                continue;
            } else {
                System.out.println("count = " + s);
                counter++;
            }
        }
        System.out.println("Count of iteration: " + counter);
    }
}
