package org.example._2026._02._07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BOJ10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<Integer, Boolean> map = new HashMap<>();
        int N = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        for(int i=0; i<N; i++){
            map.put(Integer.parseInt(s[i]), true);
        }
        int M = Integer.parseInt(br.readLine());
        String[] s2 = br.readLine().split(" ");
        for(int i=0; i<M; i++){
            sb.append(map.get(Integer.parseInt(s2[i]))!=null ? 1 : 0).append(" ");
        }
        System.out.println(sb);
    }
}
