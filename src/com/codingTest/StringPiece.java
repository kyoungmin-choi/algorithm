package com.codingTest;

public class StringPiece {
    public static void main(String[] args) {
        String s = "abcxyasdfasdfxyabc";

        String a = find(s);
        String b = find(a);
        String c = find(b);


    }

    public static String find(String s){
        int originS = s.length();
        String first = s.substring(0, s.length() / 2);
        String second = s.substring(s.length() / 2, s.length());
        String ex = "";
        String temp = "";

        for (int i = 0; i < originS; i++) {
            temp = ex;
            ex = ex.concat(String.valueOf(s.charAt(i)));
            if (!first.contains(ex) && !second.contains(ex)) {
                break;
            }
        }
        return temp;
    }
}
