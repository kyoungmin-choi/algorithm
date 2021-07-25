/*
package com.kakao.level2;

public class StringCompression {
    public static void main(String[] args) {
        String s = "abcabcabcabcdededededede";
        StringBuilder word = new StringBuilder(s);
        StringBuilder total = new StringBuilder("");
        int length = s.length();

        int before = 0;
        int after = 0;


        for (int j = 0; j < length; j++) {
            for (int i = 0; i < length; i++) {
                if (j > 2) {
                    StringBuilder temp = new StringBuilder("");
                    for (int k = i; k < j; k++) {
                        word.charAt(k) == word.charAt(k + j);

                    }
                }
            }
        }
    }
}

*/
