package org.example._2026._01._30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BOJ3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> mapX = new HashMap<>();
        HashMap<Integer, Integer> mapY = new HashMap<>();
        for(int i=0; i<3; i++){
            String[] s = br.readLine().split(" ");
            if(mapX.containsKey(Integer.parseInt(s[0]))){
                mapX.put(Integer.parseInt(s[0]), mapX.get(Integer.parseInt(s[0])) + 1);
            } else{
                mapX.put(Integer.parseInt(s[0]), 1);
            }

            if(mapY.containsKey(Integer.parseInt(s[1]))){
                mapY.put(Integer.parseInt(s[1]), mapY.get(Integer.parseInt(s[1])) + 1);
            } else{
                mapY.put(Integer.parseInt(s[1]), 1);
            }
        }
        for (Integer i : mapX.keySet()) {
            if(mapX.get(i) == 1) sb.append(i).append(" ");
        }
        for (Integer i : mapY.keySet()) {
            if(mapY.get(i) == 1) sb.append(i);
        }
        System.out.println(sb);
    }
}
