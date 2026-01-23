package org.example._2026._01._23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        double sum = 0;
        int max = 0;
        for(int i=0; i<N; i++){
            int score = Integer.parseInt(s[i]);
            if(score > max) max = score;
        }
        for(int i=0; i<N; i++){
            double score = Double.parseDouble(s[i]);
            double newScore = (score / max) * 100;
            sum += newScore;
        }
        System.out.println(sum/N);
    }
}
