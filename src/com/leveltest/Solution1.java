package com.leveltest;

import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        int n = 123;
        int answer = 0;
        String temp = Integer.toString(n);
        int[] te = Arrays.stream(temp.split("")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < te.length; i++) {
            answer += te[i];
        }
        System.out.println("?");
    }
}