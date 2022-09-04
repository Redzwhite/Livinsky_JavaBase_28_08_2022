package com.hillel.livinsky.lessons.lesson3;

public class Main {
    public static void main(String[] args) {

        int oneSide = 10;
        int secondSide = 10;
        int height = 15;
        int volume = oneSide * secondSide * height;
        int length = volume / (oneSide * secondSide);

        System.out.println("Об'єм паралелепіпеда = " + volume);
        System.out.println("Довжина паралелепіпеда = " + length);

    }
}
