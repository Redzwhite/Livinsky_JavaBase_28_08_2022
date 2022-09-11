package com.hillel.livinsky.lessons.lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String firstTeamName = "Dogs";
        int fragsPlayerOneDogs = 2;
        int fragsPlayerTwoDogs = 1;
        int fragsPlayerThreeDogs = 1;
        int fragsPlayerFourDogs = 1;
        int fragsPlayerFiveDogs = 1;
        String secondTeamName = "Cats";
        int fragsPlayerOneCats = 1;
        int fragsPlayerTwoCats = 1;
        int fragsPlayerThreeCats = 1;
        int fragsPlayerFourCats = 1;
        int fragsPlayerFiveCats = 1;
        int averageFragsTeamDogs = fragsPlayerOneDogs + fragsPlayerTwoDogs + fragsPlayerThreeDogs + fragsPlayerFourDogs + fragsPlayerFiveDogs;
        int averageFragsTeamCats = fragsPlayerOneCats + fragsPlayerTwoCats + fragsPlayerThreeCats + fragsPlayerFourCats + fragsPlayerFiveCats;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Будь ласка, введіть будь-яке ціле число");

        if (scanner.hasNextInt()) {
            if (averageFragsTeamDogs > averageFragsTeamCats) {
                System.out.println("Перемогла команда " + firstTeamName + " набрала " + averageFragsTeamDogs + " очків");
            } else if (averageFragsTeamDogs < averageFragsTeamCats) {
                System.out.println("Перемогла команда " + secondTeamName + " набрала " + averageFragsTeamCats + " очків");
            } else {
                System.out.println("Нічия " + firstTeamName + " набрала " + averageFragsTeamDogs + " очків та " + secondTeamName + " набрала " + averageFragsTeamCats + " очків");
            }
            scanner.nextLine();
            scanner.close();
        } else {
            System.out.println("НЕПРАВИЛЬНІ ДАНІ! БУДЬ ЛАСКА, ПЕРЕЗПУСТІТЬ ПРОГРАМУ ТА СПРОБУЙТЕ ЩЕ");
            scanner.nextLine();
            scanner.close();

        }

    }

}


