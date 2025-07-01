package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _20437 {
    static int min;
    static int max;
    static int cnt;

    public static void main(String[] args) throws IOException {
        HashMap<Character, Integer> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            min = 2147483647;
            max = 0;
            String str = br.readLine();
            cnt = Integer.parseInt(br.readLine());


            for(char c : str.toCharArray()){
                if(map.containsKey(c)){
                    map.put(c, map.get(c) + 1);
                    continue;
                }
                map.put(c, 1);
            }

            for(char key : map.keySet()){
                if(map.get(key) >= cnt){
                    findStr(str, key);
                }
            }
            if(max == 0) sb.append(-1);
            else sb.append(min + " " + max);

            if(i != T-1) sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    static void findStr(String origin, char find){
        List<Integer> cntList = new ArrayList<>();

        for(int i=0; i<origin.length(); i++){
            if(origin.charAt(i) == find){
                cntList.add(i);
            }
        }

        int range = cntList.size() - cnt;
        for(int i=0; i<=range; i++){
            int idx = cntList.get(i+cnt - 1) - cntList.get(i) + 1;
            if(idx < min) min = idx;
            if(idx > max) max = idx;
        }
    }
}
