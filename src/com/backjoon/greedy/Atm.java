package com.backjoon.greedy;

import java.io.*;
import java.util.*;

public class Atm {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);
        int[] arr = new int[n];
        s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Integer[] array = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(array);

        int total = 0;

        for (int i = 0; i < array.length; i++) {
            int temp = 0;
            for(int j=0;j<=i;j++){
                temp +=array[j];
            }

            total = total + temp;
        }

        System.out.println(total);
    }
}
