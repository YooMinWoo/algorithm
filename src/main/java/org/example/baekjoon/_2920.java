package org.example.baekjoon;

import java.io.*;

public class _2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for(String s : input){
            sb.append(s);
        }
        String result = sb.toString();
        if(result.equals("87654321")) System.out.println("descending");
        else if(result.equals("12345678")) System.out.println("ascending");
        else System.out.println("mixed");

    }
}
