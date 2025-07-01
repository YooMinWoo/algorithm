package org.example.baekjoon;


import java.io.*;

public class _2953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int index = 0;
        int max = 0;

        for(int i = 1; i <= 5; i ++){
            String[] scoreList = br.readLine().split(" ");
            int score = 0;
            for(String s : scoreList){
                score += Integer.parseInt(s);
            }
            if(score > max){
                max = score;
                index = i;
            }
        }

        System.out.println(index + " " + max);
    }
}
