package com.hillel.livinsky.lessons.lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner firstNameForTeam = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a name for first team");

        String teamNameOne = firstNameForTeam.nextLine();
        System.out.println("Name for fist team is: " + teamNameOne);

        Scanner secondNameForTeam = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a name for second team");

        String teamNameTwo = secondNameForTeam.nextLine();
        System.out.println("Name for second team is: " + teamNameTwo);

        Scanner fragsPlayerOneTeamOne = new Scanner(System.in);
        System.out.println("Enter number of frags for player one per team " + teamNameOne);
        if (fragsPlayerOneTeamOne.hasNextInt()) {
            fragsPlayerOneTeamOne.nextInt();
        } else {
            System.out.println("INCORRECT DATA! RESTART THE PROGRAM AND TRY AGAIN");
            System.exit(0);
        }

        Scanner fragsPlayerTwoTeamOne = new Scanner(System.in);
        System.out.println("Enter number of frags for player two per team " + teamNameOne);
        if (fragsPlayerTwoTeamOne.hasNextInt()) {
            fragsPlayerTwoTeamOne.nextInt();
        } else {
            System.out.println("INCORRECT DATA! RESTART THE PROGRAM AND TRY AGAIN");
            System.exit(0);
        }

        Scanner fragsPlayerThreeTeamOne = new Scanner(System.in);
        System.out.println("Enter number of frags for player three per team " + teamNameOne);
        if (fragsPlayerThreeTeamOne.hasNextInt()) {
            fragsPlayerThreeTeamOne.nextInt();
        } else {
            System.out.println("INCORRECT DATA! RESTART THE PROGRAM AND TRY AGAIN");
            System.exit(0);
        }

        Scanner fragsPlayerFourTeamOne = new Scanner(System.in);
        System.out.println("Enter number of frags for player four per team " + teamNameOne);
        if (fragsPlayerFourTeamOne.hasNextInt()) {
            fragsPlayerFourTeamOne.nextInt();
        } else {
            System.out.println("INCORRECT DATA! RESTART THE PROGRAM AND TRY AGAIN");
            System.exit(0);
        }

        Scanner fragsPlayerFiveTeamOne = new Scanner(System.in);
        System.out.println("Enter number of frags for player five per team " + teamNameOne);
        if (fragsPlayerFiveTeamOne.hasNextInt()) {
            fragsPlayerFiveTeamOne.nextInt();
        } else {
            System.out.println("INCORRECT DATA! RESTART THE PROGRAM AND TRY AGAIN");
            System.exit(0);
        }

        Scanner fragsPlayerOneTeamTwo = new Scanner(System.in);
        System.out.println("Enter number of frags for player one per team " + teamNameTwo);
        if (fragsPlayerOneTeamTwo.hasNextInt()) {
            fragsPlayerOneTeamTwo.nextInt();
        } else {
            System.out.println("INCORRECT DATA! RESTART THE PROGRAM AND TRY AGAIN");
            System.exit(0);
        }

        Scanner fragsPlayerTwoTeamTwo = new Scanner(System.in);
        System.out.println("Enter number of frags for player two per team " + teamNameTwo);
        if (fragsPlayerTwoTeamTwo.hasNextInt()) {
            fragsPlayerTwoTeamTwo.nextInt();
        } else {
            System.out.println("INCORRECT DATA! RESTART THE PROGRAM AND TRY AGAIN");
            System.exit(0);
        }

        Scanner fragsPlayerThreeTeamTwo = new Scanner(System.in);
        System.out.println("Enter number of frags for player three per team " + teamNameTwo);
        if (fragsPlayerThreeTeamTwo.hasNextInt()) {
            fragsPlayerThreeTeamTwo.nextInt();
        } else {
            System.out.println("INCORRECT DATA! RESTART THE PROGRAM AND TRY AGAIN");
            System.exit(0);
        }

        Scanner fragsPlayerFourTeamTwo = new Scanner(System.in);
        System.out.println("Enter number of frags for player four per team " + teamNameTwo);
        if (fragsPlayerFourTeamTwo.hasNextInt()) {
            fragsPlayerFourTeamTwo.nextInt();
        } else {
            System.out.println("INCORRECT DATA! RESTART THE PROGRAM AND TRY AGAIN");
            System.exit(0);
        }

        Scanner fragsPlayerFiveTeamTwo = new Scanner(System.in);
        System.out.println("Enter number of frags for player five per team " + teamNameTwo);
        if (fragsPlayerFiveTeamTwo.hasNextInt()) {
            fragsPlayerFiveTeamTwo.nextInt();
        } else {
            System.out.println("INCORRECT DATA! RESTART THE PROGRAM AND TRY AGAIN");
            System.exit(0);
        }


        int averageFragsTeamOne = (fragsPlayerOneTeamOne.nextInt() + fragsPlayerTwoTeamOne.nextInt() + fragsPlayerThreeTeamOne.nextInt() + fragsPlayerFourTeamOne.nextInt() + fragsPlayerFiveTeamOne.nextInt()) / 5;
        int averageFragsTeamTwo = (fragsPlayerOneTeamTwo.nextInt() + fragsPlayerTwoTeamTwo.nextInt() + fragsPlayerThreeTeamTwo.nextInt() + fragsPlayerFourTeamTwo.nextInt() + fragsPlayerFiveTeamTwo.nextInt()) / 5;
        if (averageFragsTeamOne > averageFragsTeamTwo) {
            System.out.println("Перемогла команда " + teamNameOne + " набрала " + averageFragsTeamOne + " очків");
        } else if (averageFragsTeamOne < averageFragsTeamTwo) {
            System.out.println("Перемогла команда " + teamNameTwo + " набрала " + averageFragsTeamTwo + " очків");
        } else {
            System.out.println("Нічия " + teamNameOne + " набрала " + averageFragsTeamOne + " очків та " + teamNameTwo + " набрала " + averageFragsTeamTwo + " очків");
        }

    }

}











