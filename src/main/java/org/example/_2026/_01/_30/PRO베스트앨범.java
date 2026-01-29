package org.example._2026._01._30;

import java.util.*;

public class PRO베스트앨범 {

    public static void main(String[] args) {

    }
    public int[] solution(String[] genres, int[] plays) {
        List<Integer> result = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, List<Integer>> map2 = new HashMap<>();
        for(int i=0; i< genres.length; i++){
            if(map.containsKey(genres[i])) {
                map.put(genres[i], map.get(genres[i]) + plays[i]);
                map2.get(genres[i]).add(i);
            }
            else {
                map.put(genres[i], plays[i]);
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map2.put(genres[i], list);
            }
        }

        List<String> keySet = new ArrayList<>(map.keySet());

        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));

        for (String key : keySet) {
            int firstValue = Integer.MIN_VALUE;
            int firstIdx = -1;
            int secondValue = Integer.MIN_VALUE;
            int secondIdx = -1;
            for (Integer idx : map2.get(key)) {
                int play = plays[idx];
                if(play > firstValue){
                    secondValue = firstValue;
                    secondIdx = firstIdx;
                    firstValue = play;
                    firstIdx = idx;
                } else if(play > secondValue){
                    secondValue = play;
                    secondIdx = idx;
                }
            }
            result.add(firstIdx);
            if(secondIdx != -1) result.add(secondIdx);
        }
        int[] answer = new int[result.size()];
        for(int i=0; i<result.size(); i++){
            answer[i] = result.get(i);
        }

        return answer;
    }
}
