package com.hash;

import java.util.Arrays;

public class NumberList {
    public static void main(String[] args) {
//        String[] phone_book = {"97674223", "1195524421", "119"};
        String[] phone_book = {"123", "456", "789"};
//        String[] phone_book = {"4321", "432"};
        Arrays.sort(phone_book);

        int total = 0;
        for (int j = 0; j < phone_book.length; j++) {
            total += solution(phone_book, phone_book[j], j);
            if (total > 0) {
                break;
            }
        }

//        if (total > 0) {
//            return false;
//        } else {
//            return true;
//        }

    }

    public static int solution(String[] arr, String number, int index) {
        for (int i = index; i < arr.length; i++) {
            if (index != i) {
                if (!(arr[i].length() < number.length())) {
                    String d = (String) arr[i].subSequence(0, number.length());
                    if (d.equals(number)) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
}
