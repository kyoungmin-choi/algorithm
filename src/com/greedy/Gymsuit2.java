package com.greedy;

import java.util.Arrays;

public class Gymsuit2{
    public static void main(String[] args) {
        int n = 3;
        int[] lost = {3};
        int[] reserve = {1};
        int answer = 0;
        //2개 틀림

        for (int i = 1; i < n + 1; i++) {
            if (isExist(lost, i) && isExist(reserve, i)) {
                lost[returnIndex(lost, i)] = 0;
                reserve[returnIndex(reserve, i)] = 0;
            }
            if (!isExist(lost,i)) {
                answer++;
            } else {
                if (i!=n) {
                    if (isExist(reserve, i - 1)) {
                        answer++;
                        reserve[returnIndex(reserve, i - 1)] = 0;
                    } else if (isExist(reserve, i + 1)) {
                        answer++;
                        reserve[returnIndex(reserve, i + 1)] = 0;
                    }
                }
            }
        }

        System.out.println("!");

    }

    public static int returnIndex(int[] arr, int i) {
        int counter = -1;
        for (int x = 0; x < arr.length; x++) {
            counter++;
            if (arr[x] == i) {
                return counter;
            }
        }
        return counter;
    }

    public static boolean isExist(int[] arr, int i) {
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == i) {
                return true;
            }
        }
        return false;
    }

}


//        for (int i = 0; i < lost.length; i++) {
//            if (isExist(reserve, lost[i])) {
//                reserve[Arrays.asList(reserve).indexOf(lost[i])] = 0;
//                lost[i] = 0;
//            } else {
//                if (lost[i] == 1 || lost[i] == n) {
//                    if (lost[i] == 1) {
//                        if (isExist(reserve, 2)) {
//                            reserve[Arrays.binarySearch(reserve, 2)] = 0;
//                            lost[i] = 0;
//                        }
//                    } else {
//                        if (isExist(reserve, n - 1)) {
//                            reserve[Arrays.binarySearch(reserve, n - 1)] = 0;
//                            lost[i] = 0;
//                        }
//                    }
//                } else {
//                    if (isExist(reserve, lost[i] + 1)) {
//                        reserve[Arrays.binarySearch(reserve, lost[i] + 1)] = 0;
//                        lost[i] = 0;
//                        System.out.println("?");
//                    } else if (isExist(reserve, lost[i] - 1)) {
//                        reserve[Arrays.binarySearch(reserve, lost[i] - 1)] = 0;
//                        lost[i] = 0;
//                    }
//                }
//            }
//        }
//        IntStream.of(reserve).anyMatch()
//
//        int nosuit = 0;
//        for (int j = 0; j < lost.length; j++) {
//            if (lost[j] > 0) {
//                nosuit++;
//            }
//        }
//
//        int total = n - nosuit;
//
//        System.out.println("?");
//    }
//
//    public static boolean isExist(int[] arr, int i) {
//        return Arrays.binarySearch(arr, i) > 0;
//    }
//}
//Arrays.binarySearch(lost, i)