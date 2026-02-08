package org.example._2026._01._30;

import java.util.HashMap;

public class PRO완주하지_못한_선수 {
    public static void main(String[] args) {

    }

    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        String result = "";
        for (String string : participant) {
            if(map.containsKey(string)) map.put(string, map.get(string) + 1);
            else map.put(string, 1);
        }
        for (String string : completion) {
            if(map.get(string) == 1) map.remove(string);
            else map.put(string, map.get(string) - 1);
        }
        for (String string : map.keySet()) {
            result = string;
        }
        return result;
    }
}
