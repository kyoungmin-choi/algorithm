package com.greedy;

public class Joystick {
    public static void main(String[] args) {
        String name = "ABABAAAAAAABA";
        int answer = 0;
//                            1    2    3    4    5    6    7    8    9    10  11   12   13   14   15   16   17   18   19   20   21   22   23   24   25   26
        String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] origin = name.split("");

        for (int i = 0; i < origin.length; i++) {
            if (i == 0 && origin[i].equals("A") && origin.length == 1) {
                answer++;
                break;
            }
            if(origin[i].equals("A")){
                answer++;
            } else {
                if (!origin[i].equals("A") && i != 0 && i != origin.length && !origin[i-1].equals("A")) {
                    answer++;
                }
                if (origin[i].compareTo("M") > 0) {
                    answer++;
                    answer += 25 - findIndex(alphabet, origin[i]);
                } else {
                    answer += findIndex(alphabet, origin[i]);
                }
            }
        }
        System.out.println("!");
    }

    public static int findIndex(String[] arr, String word) {
        for (int x = 0; x < arr.length; x++) {
            if (arr[x].equals(word)) {
                return x;
            }
        }
        return 0;
    }
}
