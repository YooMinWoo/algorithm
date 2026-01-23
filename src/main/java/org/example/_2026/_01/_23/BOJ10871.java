package org.example._2026._01._23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] s = br.readLine().split(" ");
        String[] s2 = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int X = Integer.parseInt(s[1]);

        for(int i=0; i<N; i++){
            if(X > (Integer.parseInt(s2[i]))) {
                sb.append(Integer.parseInt(s2[i]));
                if(i+1 < N) sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}
