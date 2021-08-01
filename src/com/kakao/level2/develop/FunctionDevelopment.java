package com.kakao.level2.develop;

import java.util.ArrayList;
import java.util.List;

public class FunctionDevelopment {
    public static void main(String[] args) {
        int[] progresses = {2, 2, 1, 2};
        int[] speeds = {1, 1, 1, 1};
//        int[] progresses = {95, 90, 99, 99, 80, 99};
//        int[] speeds = {1, 1, 1, 1, 1, 1};
//        int[] progresses = {93, 30, 55};
//        int[] speeds = {1, 30, 5};
//        int[] progresses = {93, 30, 55, 60, 40, 65};
//        int[] speeds = {1, 30, 5, 10, 60, 7};

        int[] done = new int[progresses.length];

        for (int i = 0; i < progresses.length; i++) {
            int rest = 100 - progresses[i];
            if (rest % speeds[i] == 0)
                done[i] = rest / speeds[i];
            else
                done[i] = rest / speeds[i] + 1;
        }

        int[] answer = solution(done);
//        return answer;
    }

    public static int[] solution(int[] v) {
        List<Integer> answer = new ArrayList<>();
        int pos = 0;
        int sum = 1;
        if (v.length == 1) {
            answer.add(1);
            return answer.stream().mapToInt(i -> i).toArray();
        }
        for (int i = 1; i < v.length; i++) {
            int temp = v[pos];
            if (v[i] <= temp) {
                sum++;
            } else if (temp > 1) {
                answer.add(sum);
                sum = 1;
                pos = i;
            } else {
                sum++;
            }
            if (i == v.length - 1) {
                answer.add(sum);
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}

