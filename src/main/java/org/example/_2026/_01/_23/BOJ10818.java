package org.example._2026._01._23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int N = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");

        for(int i=0; i<N; i++){
            int c = Integer.parseInt(s[i]);
            if(c < min) min = c;
            if(c > max) max = c;
        }
        System.out.println(min + " " + max);
    }
}
