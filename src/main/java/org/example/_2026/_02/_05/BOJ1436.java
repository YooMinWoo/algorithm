package org.example._2026._02._05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        int start = 666;

        while(true){
            if(String.valueOf(start).contains("666")) cnt++;
            if(cnt == N) break;
            start++;
        }
        System.out.println(start);
    }
}
