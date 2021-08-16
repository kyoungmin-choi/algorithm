package com.dfsbfs;

public class TargetNumber2 {
    static int answer = 0;

    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;

        solution(numbers, 0, 0, target);
//        return answer;
    }

    public static void solution(int[] arr, int total, int index, int target) {
        int plus = total;
        int minus = total;

        plus += arr[index];
        minus -= arr[index];

        index++;

        if (index == arr.length) {
            if (plus == target) {
                answer++;
            }
            if (minus == target) {
                answer++;
            }
        }

        if (index == arr.length) {
            return;
        }
        solution(arr, plus, index, target);
        solution(arr, minus, index, target);
    }
}
