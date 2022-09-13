package com.hillel.livinsky.lessons.lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a team name for the first team");
        String firstNameForTeam = new String();
        firstNameForTeam = scanner.nextLine();
        System.out.println("Team name for the fist team is: " + firstNameForTeam);
        System.out.println("Enter a team name for the second team");
        String secondNameForTeam = new String();
        secondNameForTeam = scanner.nextLine();
        if (firstNameForTeam.equals(secondNameForTeam)) {
            System.out.println("Team name already exists, Restart the program and try again!");
            System.exit(0);
        } else {
            System.out.println("Team name for the second team is: " + secondNameForTeam);
        }

        System.out.println("Enter number of frags for player 1 per team " + firstNameForTeam);
        int fragsPlayerOneTeamOne = 0;
        if (scanner.hasNextInt()) {
            fragsPlayerOneTeamOne = scanner.nextInt();
        } else {
            System.out.println("INCORRECT DATA! RESTART THE PROGRAM AND TRY AGAIN");
            System.exit(0);
        }
        System.out.println("Enter number of frags for player 2 per team " + firstNameForTeam);
        int fragsPlayerTwoTeamOne = 0;
        if (scanner.hasNextInt()) {
            fragsPlayerTwoTeamOne = scanner.nextInt();
        } else {
            System.out.println("INCORRECT DATA! RESTART THE PROGRAM AND TRY AGAIN");
            System.exit(0);
        }
        System.out.println("Enter number of frags for player 3 per team " + firstNameForTeam);
        int fragsPlayerThreeTeamOne = 0;
        if (scanner.hasNextInt()) {
            fragsPlayerThreeTeamOne = scanner.nextInt();
        } else {
            System.out.println("INCORRECT DATA! RESTART THE PROGRAM AND TRY AGAIN");
            System.exit(0);
        }
        System.out.println("Enter number of frags for player 4 per team " + firstNameForTeam);
        int fragsPlayerFourTeamOne = 0;
        if (scanner.hasNextInt()) {
            fragsPlayerFourTeamOne = scanner.nextInt();
        } else {
            System.out.println("INCORRECT DATA! RESTART THE PROGRAM AND TRY AGAIN");
            System.exit(0);
        }
        System.out.println("Enter number of frags for player 5 per team " + firstNameForTeam);
        int fragsPlayerFiveTeamOne = 0;
        if (scanner.hasNextInt()) {
            fragsPlayerFiveTeamOne = scanner.nextInt();
        } else {
            System.out.println("INCORRECT DATA! RESTART THE PROGRAM AND TRY AGAIN");
            System.exit(0);
        }
        System.out.println("Enter number of frags for player 1 per team " + secondNameForTeam);
        int fragsPlayerOneTeamTwo = 0;
        if (scanner.hasNextInt()) {
            fragsPlayerOneTeamTwo = scanner.nextInt();
        } else {
            System.out.println("INCORRECT DATA! RESTART THE PROGRAM AND TRY AGAIN");
            System.exit(0);
        }
        System.out.println("Enter number of frags for player 2 per team " + secondNameForTeam);
        int fragsPlayerTwoTeamTwo = 0;
        if (scanner.hasNextInt()) {
            fragsPlayerTwoTeamTwo = scanner.nextInt();
        } else {
            System.out.println("INCORRECT DATA! RESTART THE PROGRAM AND TRY AGAIN");
            System.exit(0);
        }
        System.out.println("Enter number of frags for player 3 per team " + secondNameForTeam);
        int fragsPlayerThreeTeamTwo = 0;
        if (scanner.hasNextInt()) {
            fragsPlayerThreeTeamTwo = scanner.nextInt();
        } else {
            System.out.println("INCORRECT DATA! RESTART THE PROGRAM AND TRY AGAIN");
            System.exit(0);
        }
        System.out.println("Enter number of frags for player 4 per team " + secondNameForTeam);
        int fragsPlayerFourTeamTwo = 0;
        if (scanner.hasNextInt()) {
            fragsPlayerFourTeamTwo = scanner.nextInt();
        } else {
            System.out.println("INCORRECT DATA! RESTART THE PROGRAM AND TRY AGAIN");
            System.exit(0);
        }
        System.out.println("Enter number of frags for player 5 per team " + secondNameForTeam);
        int fragsPlayerFiveTeamTwo = 0;
        if (scanner.hasNextInt()) {
            fragsPlayerFiveTeamTwo = scanner.nextInt();
        } else {
            System.out.println("INCORRECT DATA! RESTART THE PROGRAM AND TRY AGAIN");
            System.exit(0);
        }

        int averageSumFragsTeamOne = (fragsPlayerOneTeamOne + fragsPlayerTwoTeamOne + fragsPlayerThreeTeamOne + fragsPlayerFourTeamOne + fragsPlayerFiveTeamOne) / 5;
        int averageSumFragsTeamTwo = (fragsPlayerOneTeamTwo + fragsPlayerTwoTeamTwo + fragsPlayerThreeTeamTwo + fragsPlayerFourTeamTwo + fragsPlayerFiveTeamTwo) / 5;
        if (averageSumFragsTeamOne > averageSumFragsTeamTwo) {
            System.out.println("Перемогла команда " + firstNameForTeam + " набрала " + averageSumFragsTeamOne + " очків");
        } else if (averageSumFragsTeamOne < averageSumFragsTeamTwo) {
            System.out.println("Перемогла команда " + secondNameForTeam + " набрала " + averageSumFragsTeamTwo + " очків");
        } else {
            System.out.println("Нічия " + firstNameForTeam + " набрала " + averageSumFragsTeamOne + " очків та " + secondNameForTeam + " набрала " + averageSumFragsTeamTwo + " очків");

        }
    }
}










