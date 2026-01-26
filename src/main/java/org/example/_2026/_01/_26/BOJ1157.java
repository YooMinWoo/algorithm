package org.example._2026._01._26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BOJ1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        int max = 0;
        int cnt = 1;
        String str = "";

        char[] chars = br.readLine().toCharArray();

        for (char c : chars) {
            String s = String.valueOf(c).toUpperCase();
            if(map.containsKey(s)) {
                map.put(s, map.get(s)+1);
                continue;
            }
            map.put(s, 1);
        }
        for (String s : map.keySet()) {
            Integer i = map.get(s);
            if (i == max) {
                cnt++;
                continue;
            }
            if(i > max) {
                max = i;
                str = s;
                cnt = 1;
            }
        }
        if(cnt > 1) {
            System.out.println("?");
            return;
        }
        System.out.println(str);

    }
}
