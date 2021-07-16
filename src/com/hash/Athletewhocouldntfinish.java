package com.hash;

import java.util.HashMap;
import java.util.Map;

public class Athletewhocouldntfinish {
    public static void main(String args[]){
        /**
        제한 사항
        - 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
        - completion의 길이는 participant의 길이보다 1 작습니다.
        - 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
        - 참가자 중에는 동명이인이 있을 수 있습니다.
         **/

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        String answer = "";

        HashMap participant1 = new HashMap();
        int i=1;
        for (String s : participant) {
            participant1.put(i, s);
            i++;
        }
        i=1;
        HashMap completion1 = new HashMap();
        for (String s : completion) {
            completion1.put(i, s);
            i++;
        }

        for(int j=0;j<participant.length;j++) {
            if(!completion1.containsValue(participant1.get(j))) {
                answer = participant1.get(j).toString();
            } else {
                participant1.replace(getKey(completion1, participant[j]), "");
            }
        }
    }
    public static <K, V> K getKey(Map<K, V> map, V value) {

        for (K key : map.keySet()) {
            if (value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
    }
}
