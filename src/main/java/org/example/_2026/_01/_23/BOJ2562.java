package org.example._2026._01._23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int curr = 0;
        int max = Integer.MIN_VALUE;
        for(int i=1; i<=9; i++){
            int n = Integer.parseInt(br.readLine());
            if(n > max) {
                curr = i;
                max = n;
            }
        }
        System.out.println(max+"\n"+curr);
    }
}
