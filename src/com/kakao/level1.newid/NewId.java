package com.kakao.level1.newid;

public class NewId {
    public static void main(String[] args) {
        String new_id = "....bat@!7e8dfeunh";
        String origin = new_id.toLowerCase(); // 1단계


        String match = "[^0-9a-zA-Z-_.]";
        int originLength = origin.length();
        origin = origin.replaceAll(match, ""); // 2단계 정규식

        // 3단계 : .. -> . 치환
        for (int i = 0; i < originLength; i++) {
            origin = origin.replace("..", ".");
        }

        StringBuilder builder = new StringBuilder(origin);

        // 4단계 : 처음이나 끝 제거함
        if (builder.length() > 0) {
            if (String.valueOf(origin.charAt(0)).equals(".")) {
                builder.setCharAt(0, ' ');
            }
            if (String.valueOf(origin.charAt(origin.length() - 1)).equals(".")) {
                builder.setCharAt(origin.length() - 1, ' ');
            }
        }

        String middle = builder.toString();
        middle = middle.trim();
        builder = new StringBuilder(middle);

        // 5단계 : 적으면 에이넣기, 아니면 지우고
        if (builder.length() == 0) {
            builder.append('a');
        } else if (builder.length() > 15) {
            builder.delete(15, builder.length());
        }

        // 6단계
        if (builder.length() > 0) {
            if (String.valueOf(builder.charAt(builder.length() - 1)).equals(".")) {
                builder.setCharAt(builder.length() - 1, ' ');
            }
        }

        // 7단계
        if (builder.length() <= 2) {
            String lastword = String.valueOf(builder.charAt(builder.length() - 1));
            while (builder.length() < 3) {
                builder.append(lastword);
            }
        }
//        System.out.println("/");
//        return builder.toString().trim();
    }
}