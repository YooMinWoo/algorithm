package org.example._2026._01._29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int result = 1;
        while (true){
            int n = Integer.parseInt(br.readLine());
            if(n == -1) break;
            sb.append(n).append(" = 1");
            for(int i=2; i<n; i++){
                if(n%i == 0){
                    sb.append(" + ").append(i);
                    result += i;
                }
            }
            if(result == n){
                System.out.println(sb);
            } else {
                System.out.println(n + " is NOT perfect.");
            }
            result = 1;
            sb = new StringBuilder();
        }
    }
}
