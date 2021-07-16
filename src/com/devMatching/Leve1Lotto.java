package com.devMatching;


public class Leve1Lotto {
    public static void main(String[] args) {
        int[] lottos = {45,4,35,20,3,9};
        int[] win_nums = {20,9,3,45,4,35};

        int matching = matching(lottos, win_nums);
        int zeroCount = countZero(lottos);
        int remain = 6 - zeroCount;

        int[] total = {0,0};
        total[0] = toLottos(matching + zeroCount);
        total[1] = toLottos(matching);

    }

    public static int toLottos(int value){
        int result = 0;
        switch (value){
            case 0 :  case 1:
                result = 6;
                break;
            case 2:
                result =  5;
                break;
            case 3:
                result =  4;
                break;
            case 4:
                result =  3;
                break;
            case 5:
                result =  2;
                break;
            case 6:
                result =  1;
                 break;
        }
        return result;
    }

    public static int matching(int[] lottos, int[] win_nums) {
        int match = 0;
        for (int i = 0; i < lottos.length; i++) {
            for (int j = 0; j < lottos.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    match++;
                }
            }
        }
        return match;
    }

    public static int countZero(int[] lotto) {
        int count = 0;
        for (int i : lotto) {
            if (i == 0) {
                count++;
            }
        }
        return count;
    }
}
