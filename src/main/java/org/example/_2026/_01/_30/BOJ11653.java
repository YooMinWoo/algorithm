package org.example._2026._01._30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int curr = 2;
        while(N > 1){
            if(N % curr == 0){
                System.out.println(curr);
                N /= curr;
                continue;
            }
            curr++;
        }
    }
}
