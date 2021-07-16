package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        String new_id = "...!@BaT#*..y.abcdefghijkl";
        // 1단계
        new_id = new_id.toLowerCase();
        List<String> id = new ArrayList<>(Arrays.asList(new_id.split("")));
        // 2단계
        id = isContainRemoveTest(id);
        // 3단계
        removeConnect(id);
//        id = trim(id);
//        // 4단계
//        removeDot(id);
//
//        // 5단계
//        if (id.size() == 0) {
//            id.set(0, "a");
//        } else if (id.size() > 16) {
//            for (int i = 16; i < id.size(); i++) {
//                id.set(i, "");
//            }
//            id = trim(id);
//            if (id.get(id.size() - 1).equals(".")) {
//                id.set(id.size() - 1, "");
//                id = trim(id);
//            }
//        }
//
//        if(id==null){
//            id.addAll(Collections.singleton("aaa"));
//
//        } else if (id.size() < 3) {
//            String last;
//            if(id.size() != 0){
//                 last = id.get(id.size() - 1);
//            } else {
//                 last = "a";
//            }
//            if(id.size()==0){
//                for (int i = 0; i < 3; i++) {
//                    System.out.println(i);
//                    id.set(i, last);
//                }
//            }else {
//                for (int i = id.size(); i < 3; i++) {
//                    System.out.println(i);
//                    id.set(i, last);
//                }
//            }
//
//        }
        String answer = id.stream().map(String::valueOf).collect(Collectors.joining());
        System.out.println(answer);
//        return answer;

    }

    // 특수문자 제거
    public static List<String> isContainRemoveTest(List<String> id) {

        List<String> result = id.stream().filter(Main::validate).collect(Collectors.toList());
        return result;

    }

    public static boolean validate(String element){
        if(element.matches("[^0-9a-zA-Z]([-_.])")) {
            return true;
        }
        return false;
    }

    public static List<String> removeConnect(List<String> loginId) {
        for (int i = 0; i < loginId.size(); i++) {
            if (loginId.get(i).equals(".")) {
                if (i + 1 < loginId.size()) {
                    if (loginId.get(i + 1).equals(".")) {
                        loginId.set(i, "");
                    }
                }
            }
        }
        return loginId;
    }

    public static List<String> removeDot(List<String> loginId) {
        if(Objects.nonNull(loginId)) {
            long size = loginId.size();
            if (size > 0) {
                if (loginId.get(0).equals(".")) {
                    loginId.set(0, "");
                }
                if (loginId.get((int) (size - 1)).equals(".")) {
                    loginId.set((int) (size - 1), "");
                }
            }
            return loginId;
        }
        return null;
    }


    public static List<String> trim(List<String> loginId) {
        String origin = loginId.stream().map(String::valueOf).collect(Collectors.joining());
        origin = origin.replaceAll(" ", "");

        if (origin.equals("")){
            return null;
        }
        List<String> id = new ArrayList<>(Arrays.asList(origin.split("")));
        return id;
    }
}
