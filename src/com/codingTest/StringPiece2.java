package com.codingTest;

public class StringPiece2 {
    public static void main(String[] args) {
        String s = "abcxyasdfasdfxyabc";
        int length = s.length();
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            answer.concat(find(s));
        }

        System.out.println("");

    }

    public static String find(String s) {
        String temp = "";
        String first = s.substring(0, s.length() / 2);
        String second = s.substring(s.length() / 2, s.length());
        int origin = first.length();
        String answer = "";

        for (int i = 0; i < origin; i++) {
            answer = temp;
            temp = temp.concat(String.valueOf(first.charAt(i)));
            if (!first.contains(temp) && !second.contains(temp)) {
                break;
            }
        }

        return s.replace(temp, "");
    }
}
