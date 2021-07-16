package com.dfsbfs;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Targetnumber {
    public static void main(String[] agrs) {
        int[] number = {1, 1, 1, 1, 1};
        int target = 3;
        int answer = 0;
        int count = -1;
        int total = 0;
        ArrayList<Integer> ya = new ArrayList<>();

        for (int i = 0; i < number.length; i++) {
            answer += find(number, count, total, target, answer, ya);
        }

        System.out.println("!!!");
    }


    // 배열         //순서     // 더해진값
    public static int find(int[] numbers, int count, int total, int target, int answer, ArrayList<Integer> si) {
        count++;
        if (count == numbers.length) {
            if (total == target) {
                si.add(1);
                return 0;
            }
            return 0;
        }
        find(numbers, count, total + numbers[count], target, answer, si);
        find(numbers, count, total - numbers[count], target, answer, si);

        return 0;
    }
}
