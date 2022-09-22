package com.hillel.livinsky.lessons.lesson8;

import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] first = new int[7];
        int[] second = new int[7];
        List<String> res = new ArrayList<>();
        var min = 0;
        var max = 9;

        for (int i = 0; i < first.length; i++) {
            first[i] = (int) Math.floor(Math.random() * (max - min + 1) + min);
            second[i] = (int) Math.floor(Math.random() * (max - min + 1) + min);
        }
        for (int i = 0; i < first.length; i++) {
            Arrays.sort(first);
            Arrays.sort(second);
            if (first[i] == second[i]) {
                res.add(String.valueOf(i));
            }
        }
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));
        System.out.println("Objects for the following indexes " + res + " are the same." + " Number of matches: " + res.size());

    }
}

