package com.kakao.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParenthesisConversion {
    public static void main(String[] args) {
        String p = "))))((((((()())()))(";
        List<String> word = new ArrayList<>(Arrays.asList(p.split("")));

        List<String> total = new ArrayList<>();
        mainFunction(word, total);
        String answer = "";

        for (int i = 0; i < total.size(); i++) {
            answer += total.get(i);
        }

        System.out.println("");
    }

    public static void mainFunction(List<String> word, List<String> total) {
        int front = 0;
        int back = 0;
        int nang = 0;

        for (int i = 0; i < word.size(); i++) {
            if (word.get(i).equals("(")) {
                nang++;
            } else {
                nang--;
            }
            if (nang < 0) {
                if (rightOrWrong(word.subList(0, i))) {
                    total.addAll(word.subList(0, i));
                } else {
                    total.addAll(returnMain(i/2));
                }
                List<String> temp = word.subList(i + 1, word.size());
                mainFunction(temp, total);
                break;

            }
        }
    }

    public static boolean rightOrWrong(List<String> word) {
        int answer = 0;
        for (int i = 0; i < word.size(); i++) {
            if (word.get(i).equals("(")) {
                answer++;
            } else {
                answer--;
            }
            if (answer < 0) {
                return false;
            }
        }

        if (answer != 0) {
            return false;
        }
        return true;
    }

    public static List<String> returnMain(int s) {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < s; i++) {
            answer.add("(");
        }
        for (int i = 0; i < s; i++) {
            answer.add(")");
        }
        return answer;
    }

}


//    public static List<String> mainFunction(String s){
//        int front = 0;
//        int back = 0;
//        List<String> word = new ArrayList<String>(Arrays.asList(s.split("")));
//        List<String> answer = new ArrayList<>();
//        List<String> newTang = new ArrayList<>();
//
//        for (int i = 0; i < word.size(); i++) {
//            if (front == back) {
//                newTang = word.subList(i, word.size());
//                break;
//            }
//            if (word.get(i).equals("(")) {
//                front++;
//            } else {
//                back++;
//            }
//            answer.add(word.get(i));
//        }
//        mainFunction(newTang.toString());
//        return answer;
//    }