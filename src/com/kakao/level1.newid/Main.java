package com.kakao.level1.newid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        String new_id = "...!@BaT#*..y.abcdefghijklm";

        // 1
        new_id = new_id.toLowerCase();
        List<String> id = new ArrayList<>(Arrays.asList(new_id.split("")));

        // 2
        List<String> whole  = removeChat(id);

        // 3
        id = removeDot(id);

        System.out.print("아이디는 : ");
        id.stream().forEach(a-> System.out.print(a));

    }

    public static List<String> removeChat(List<String> list) {
        List<String> re = list.stream().filter(Main::remove).collect(Collectors.toList());
        return re;
    }

    public static boolean remove(String id) {
        if (id.matches("[^0-9a-zA-Z]([-_.])")) {
            return true;
        }
        return false;
    }

    public static List<String> removeDot(List<String> id) {
        long size = id.size();

        if (size > 1) {
            for (int i = 0; i < size; i++) {
                if (i + 1 != 0) {
                    if (id.get(i).equals(".") && id.get(i + 1).equals(".")) {
                        id.set(i, "");
                    }
                }
            }
        }

        String origin = id.stream().map(String::valueOf).collect(Collectors.joining( ));
        origin.replaceAll(" ", "");

        return new ArrayList<>(Arrays.asList(origin.split("")));

    }
}
