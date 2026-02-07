package org.example._2026._02._07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BOJ11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> set = new HashSet<>();
        String S = br.readLine();
        int cnt = 0;
        int N = S.length();
        while(cnt < N){
            for(int i=0; i<N-cnt; i++){
                set.add(S.substring(i, i+cnt + 1));
            }
            cnt++;
        }
        System.out.println(set.size());
    }
}
