package com.hillel.livinsky.lessons.homework18;

public class ArraysUtil {

    public static double getAverageArithmeticOfArrayElements(double[] array) {
        double result = 0.0;

        for (double d : array) {

            result += d;
        }
        return result / array.length;
    }
    public static boolean checkingArrayForSquare(int[][] array) {
        for (int i = 0, l = array.length; i < l; i++) {
            if (array[i].length != l) {
                return false;
            }
        }
        return true;
    }
}
