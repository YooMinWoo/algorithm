package org.example._2026._01._24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            String[] s = br.readLine().split(" ");
            int R = Integer.parseInt(s[0]);
            char[] charArray = s[1].toCharArray();
            for (char c : charArray) {
                for(int j=0; j<R; j++){
                    sb.append(String.valueOf(c));
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
