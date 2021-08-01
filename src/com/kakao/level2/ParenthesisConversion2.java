package com.kakao.level2;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;

public class ParenthesisConversion2 {
    // (((()())())())((()))
    public static void main(String[] args) {
        String answer = solution("()))((()");

        System.out.println("?");
    }


    public static int isRight(String p) {
        int total = 0;

        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '(') {
                total++;
            } else {
                if (i == 0) {
                    return 0;
                }
                total--;
            }

            if (total == 0) {
                return i + 1;
            }
        }
        return 0;
    }

    public static String solution(String p) {
        String u = "";
        String v = "";

        if (p.isEmpty()) {
            return p;
        }

        if (isRight(p) > 0) {
            u = p.substring(0, isRight(p));
            v = p.substring(isRight(p), p.length());
            return u + solution(v);
        }

        String answer = "(" + solution(v) + ")";
        answer += upSideDown(u);
        return answer;

    }


    public static String upSideDown(String p) {
        String answer = "";
        for (int i = 1; i < p.length() - 1; i++) {
            if (p.charAt(i) == '(') {
                answer = answer + ")";
            } else {
                answer = answer + "(";
            }
        }
        return answer;
    }
}