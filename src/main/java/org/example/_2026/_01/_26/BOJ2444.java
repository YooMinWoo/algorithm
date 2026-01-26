package org.example._2026._01._26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<2*N+1; i++){
            int blank = Math.abs(N - (i + 1));
            int star = (N-blank)*2 - 1;
            for(int j=0; j<blank; j++){
                sb.append(" ");
            }
            for(int j=0; j<star; j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
