package com;

import java.util.Arrays;
import java.util.Collections;

//1:27~1:50
public class Whoisk {
    public static void main(String[] args){
        int[] array = {1,100000,2,100000,3,4,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};

        int[] answer = new int[commands.length];

        for(int i=0;i<commands.length;i++){
            int[] top = commands[i];
            int[] cut = Arrays.copyOfRange(array,top[0]-1, top[1]);
            Arrays.sort(cut);

            answer[i] = cut[top[2]-1];
        }
    }
}
//    String origin = Arrays.toString(array).replaceAll("[^0-9]","");
//
//    int[] answer = new int[commands.length];
//
//        for(int i=0;i<commands.length;i++){
//        int[] top = commands[i];
//        String slice = origin.substring(top[0]-1, top[1]);
//        String[] to = slice.split("");
//        Arrays.sort(to);
//
//        answer[i] = Integer.parseInt(to[top[2]-1]);
//        }
//        return answer;