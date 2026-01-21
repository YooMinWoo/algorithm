package org.example._2026._01._21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int i=1; i<=T; i++){
            for(int j=0; j<(T-i); j++){
                sb.append(" ");
            }
            for(int k=0; k<i; k++){
                sb.append("*");
            }
            if(i < T) sb.append("\n");
        }
        System.out.println(sb);
    }
}
