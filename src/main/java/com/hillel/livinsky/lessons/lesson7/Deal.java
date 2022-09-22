package com.hillel.livinsky.lessons.lesson7;

import java.util.Scanner;

public class Deal {

    public static void main(String[] args) {

        // часть 1 - инициализация переменных
        int cardsPerPlayer = 5;
        int players = 0;

        String[] suits = {"\u2660", "\u2665", "\u2663", "\u2666"
        };

        String[] rank = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };

        int numberOfCards = suits.length * rank.length; // количество карт


        // часть 2 - ввод с консоли
        while (true) {
            Scanner dataInput = new Scanner(System.in);
            System.out.println("Enter the number of players: ");

            if (dataInput.hasNextInt()) {

                players = dataInput.nextInt();
                if (cardsPerPlayer * players <= numberOfCards) {
                    break;
                } else {
                    if (players == 0) {

                        System.out.println("The game has been terminated.");
                        break;

                    } else if (players < 0) {

                        System.out.println("The number of players cannot be less than 0");

                    } else {

                        System.out.println("Too many players!");
                    }
                }

            } else {
                System.out.println("You entered the wrong number, or your number is too large!");

            }
        }


        // часть 3 - инициализация колоды
        String[] deck = new String[numberOfCards];
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = rank[i] + " " + suits[j];
            }
        }

        // часть 4 - перетасовка колоды
        for (int i = 0; i < numberOfCards; i++) {
            int r = i + (int) (Math.random() * (numberOfCards - i)); // случайная карта в колоде
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        // часть 5 - перетасованная колода выводится на экран
        for (int i = 0; i < players * cardsPerPlayer; i++) {
            System.out.println(deck[i]);
            if (i % cardsPerPlayer == cardsPerPlayer - 1)
                System.out.println();
        }
    }

}

