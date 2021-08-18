package com.hash;

import java.util.Arrays;

public class Athletewhocouldntfinish2 {
    public static void main(String[] args) {

//        String[] participant = {"mislav", "stanko", "mislav", "ana"};
//        String[] completion = {"stanko", "ana", "mislav"};

        String[] participant = {"ab", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
//
//        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
//        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        Arrays.sort(participant);
        Arrays.sort(completion);

        String answer = "";
        int repeat = 0;
        repeat = completion.length;

        for (int i = 0; i < repeat; i++) {
            if (!participant[i].equals(completion[i])) {
//                return answer = participant[i];
            }
        }

        if (!(answer.length() > 0)) {
            answer = participant[participant.length - 1];
        }

//        return answer;
        System.out.println(answer);

    }

}
