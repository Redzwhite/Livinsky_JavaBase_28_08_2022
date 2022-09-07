package com.hillel.livinsky.lessons.lesson4;

public class Main {

    public static void main(String[] args) {

        double mingWarriorAttack = 13;
        double mingArcherAttack = 24;
        double mingRiderAttack = 46;

        double leeWarriorAttack = 9;
        double leeArcherAttack = 35;
        double leeRiderAttack = 12;

        int numberOfMingWarriors = 860;
        int numberOfMingArchers = 860;
        int numberOfMingRiders = 860;

        double numberOfLeeWarriors = numberOfMingWarriors * 1.5;
        double numberOfLeeArchers = numberOfMingArchers * 1.5;
        double numberOfLeeRiders = numberOfMingRiders * 1.5;
        int amountIntLeeWarriors = (int)numberOfLeeWarriors;
        int amountIntLeeArchers = (int)numberOfLeeArchers;
        int amountIntLeeRiders = (int)numberOfLeeRiders;

        double generalAttackMingWarrior = mingWarriorAttack * numberOfMingWarriors;
        double generalAttackMingArchers = mingArcherAttack * numberOfMingArchers;
        double generalAttackMingRiders = mingArcherAttack * numberOfMingRiders;

        double generalAttackLeeWarrior = leeWarriorAttack * amountIntLeeWarriors;
        double generalAttackLeeArchers = leeArcherAttack * amountIntLeeArchers;
        double generalAttackLeeRiders = leeRiderAttack * amountIntLeeRiders;

        double totalNumberOfLeeArmies = amountIntLeeWarriors + amountIntLeeArchers + amountIntLeeRiders;
        double totalNumberOfMingArmies = numberOfMingWarriors + numberOfMingArchers + numberOfMingRiders;

        double totalAttackValueOfMingArmies = (mingWarriorAttack + mingArcherAttack + mingRiderAttack) * totalNumberOfLeeArmies;
        double totalAttackValueOfLeeArmies = (leeWarriorAttack + leeArcherAttack + leeRiderAttack) * totalNumberOfMingArmies;

        System.out.println("Attack value of Ming warriors " + generalAttackMingWarrior);
        System.out.println("Attack value of Ming archers " + generalAttackMingArchers);
        System.out.println("Attack value of Ming riders " + generalAttackMingRiders);
        System.out.println("Total attack value of Ming armies " + totalAttackValueOfMingArmies);
        System.out.println();
        System.out.println("Attack value of Lee warriors " + generalAttackLeeWarrior);
        System.out.println("Attack value of Lee archers " + generalAttackLeeArchers);
        System.out.println("Attack value of Lee riders " + generalAttackLeeRiders);
        System.out.println("Total attack value of Lee armies " + totalAttackValueOfLeeArmies);


    }
}
