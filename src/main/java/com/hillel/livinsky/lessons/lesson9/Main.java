package com.hillel.livinsky.lessons.lesson9;

import java.util.*;

public class Main {
    public static int[][] generateMatrix(int x, int y, boolean reverse) {
        var min = 1;
        var max = 10;
        int array[][];
        if (reverse) {
            array = new int[y][x];
            for (int i = 0; i < y; i++) {
                for (int j = 0; j < x; j++) {
                    array[i][j] = (int) Math.floor(Math.random() * (max - min + 1) + min);
                }
            }
        } else {
            array = new int[x][y];
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    array[i][j] = (int) Math.floor(Math.random() * (max - min + 1) + min);
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("Enter rows in table: ");
            Scanner input = new Scanner(System.in);
            if (input.hasNextInt()) {
                int x = input.nextInt();
                if (x < 0) {
                    System.out.println("INCORRECT X! X CANNOT BE NEGATIVE! RESTART THE PROGRAM AND TRY AGAIN");
                    continue;
                }
                System.out.println("Enter col in table: ");
                int y = input.nextInt();
                if (y < 0) {
                    System.out.println("INCORRECT Y! Y CANNOT BE NEGATIVE! RESTART THE PROGRAM AND TRY AGAIN");
                    continue;
                }
                int array[][] = generateMatrix(x, y, false);
                int array2[][] = generateMatrix(x, y, true);
                System.out.println(Arrays.deepToString(array) + "\t");
                System.out.println(Arrays.deepToString(array2) + "\t");
                break;
//Next code can be used if we need check both values X and Y
//                if (x < 0 || y < 0) {
//                    System.out.println("INCORRECT DATA! RESTART THE PROGRAM AND TRY AGAIN");
//                    continue;
//                } else {
//                    int array[][] = generateMatrix(x, y, false);
//                    int array2[][] = generateMatrix(x, y, true);
//                    System.out.println(Arrays.deepToString(array) + "\t");
//                    System.out.println(Arrays.deepToString(array2) + "\t");
//                    break;
//                }
            } else {
                System.out.println("INCORRECT DATA! RESTART THE PROGRAM AND TRY AGAIN");
                continue;
            }
        }
    }
}





