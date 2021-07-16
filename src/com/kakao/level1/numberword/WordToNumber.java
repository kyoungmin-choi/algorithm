package com.kakao.level1.numberword;

import java.util.HashMap;
import java.util.Map;

public class WordToNumber {
    public static void main(String[] args) {
        String s = "one4seveneight";

        Map<Integer, String> numberSet = new HashMap<Integer, String>() {
            {
                put(0, "zero");
                put(1, "one");
                put(2, "two");
                put(3, "three");
                put(4, "four");
                put(5, "five");
                put(6, "six");
                put(7, "seven");
                put(8, "eight");
                put(9, "nine");
            }
        };

        for (int i = 0; i < numberSet.size(); i++) {
            if (s.contains(numberSet.get(i))) {
                String old = numberSet.get(i);
                String newthang = String.valueOf(i);
                s = s.replace(old, newthang);
            }
        }

        int answer = Integer.parseInt(s);

    }
}
