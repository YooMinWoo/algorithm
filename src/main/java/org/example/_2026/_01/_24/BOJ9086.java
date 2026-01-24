package org.example._2026._01._24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String s = br.readLine();
            char left = s.charAt(0);
            char right = s.charAt(s.length() - 1);
            sb.append(left).append(right).append("\n");
        }
        System.out.println(sb);
    }
}
