package com.leveltest;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String repeat = "";

        for (int j = 0; j < a; j++) {
            repeat += "*";
        }

        for (int i = 0; i < b; i++) {
            System.out.println(repeat);
        }
    }
}
