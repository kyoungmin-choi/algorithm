package com.backjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class MeetingRoom {
    static int temp = 0;
    static int current = 0;

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
                return  (o1[1] - o1[0]) - (o2[1] - o2[0]);
            }
        });

        int index = arr[0][0];
        int lastIndex = arr[0][1];
        for (int j = 1; j < arr.length; j++) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i][0] >= lastIndex) {
                    temp++;
                }
                index = arr[i][0];
                lastIndex = arr[i][1];
            }
        }

        System.out.println("?");
    }
}
