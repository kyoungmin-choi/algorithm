package com.backjoon.greedy;

import java.io.*;
import java.util.*;

public class Coin0 {
    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//
//        int[] money = new int[n];
//        for (int i = 0; i < n; i++) {
//            money[i] = sc.nextInt();
//        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] money = new int[n+1];
        for(int i = 1; i<=n; i++){
            money[i] = Integer.parseInt(br.readLine());
        }


        int total = 0;
        for (int i = n; i >= 1; i--) {
            int divide = k / money[i];
            if (divide > 0) {
                k = k - (money[i] * divide);
                total += divide;
            }

        }
        System.out.println(total);
    }
}
