package org.example._2026._01._21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            String[] s = br.readLine().split(" ");
            sb.append("Case #").append(i + 1).append(": ").append(Integer.parseInt(s[0]) + Integer.parseInt(s[1]));
            if(i+1 < T) sb.append("\n");
        }
        System.out.println(sb);
    }
}
