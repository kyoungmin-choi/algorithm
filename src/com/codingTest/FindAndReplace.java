package com.codingTest;

public class FindAndReplace {
    public static void main(String[] args) {
        String s = "aabcbcd";
        String t = "abc";
        int originLength = s.length();
        int result = 0;

        for (int i = 0; i < originLength; i++) {
            if (s.contains(t)) {
                result++;
                s = s.replace(t, "");
            }
        }
    }
}
