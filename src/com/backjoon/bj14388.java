package com.backjoon;

import java.util.*;

public class bj14388 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = in.nextInt();
        }

        int plus = in.nextInt();
        int minus = in.nextInt();
        int multiple = in.nextInt();
        int divide = in.nextInt();
        int index = 0;
        int total = nums[0];

        ArrayList<Integer> arr = new ArrayList<>();
        addAll(arr, plus, minus, multiple, divide, index, total, nums);


        if (arr.size() == 1) {
            System.out.println(arr.get(0));
        } else {
            Collections.sort(arr);
            System.out.println(arr.get(arr.size()-1));
        }
        System.out.println(arr.get(0));

    }

    public static void addAll(ArrayList<Integer> arr, int plus, int minus, int multi, int divide, int index, int total, int[] nums) {
        index++;
        if (index == nums.length) {
            arr.add(total);
        }

        if (plus > 0) {
            int p = total + nums[index];
            addAll(arr, plus - 1, minus, multi, divide, index, p, nums);
        }

        if (minus > 0) {
            int m = total - nums[index];
            addAll(arr, plus, minus - 1, multi, divide, index, m, nums);
        }

        if (multi > 0) {
            int mul = total * nums[index];
            addAll(arr, plus, minus, multi - 1, divide, index, mul, nums);
        }

        if (divide > 0) {
            int d = total / nums[index];
            addAll(arr, plus, minus, multi, divide - 1, index, d, nums);
        }
    }
}
