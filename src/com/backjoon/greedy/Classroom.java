package com.backjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Classroom {
    static int total = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][1];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int[] temp = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
            arr[i] = temp;
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        while (addAll(arr) > 0) {
            arr = function(arr);
        }

        System.out.println(total);
    }

    public static int[][] function(int[][] arr) {
        Set<Integer> temp = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (temp.contains(arr[i][0] + 1) ) {
            } else if ((arr[i][0] + arr[i][1]) > 0 && !temp.contains(arr[i][1])) {
                for (int j = arr[i][0]; j < arr[i][1] + 1; j++) {
                    temp.add(j);
                }
                arr[i][0] = 0;
                arr[i][1] = 0;
                if (addAll(arr) == 0) {
                    break;
                }
            }

        }
        total++;
        return arr;

    }

    public static int addAll(int[][] arr) {
        int total = 0;
        for (int[] ints : arr) {
            total += ints[0];
            total += ints[1];
        }
        return total;
    }
}

