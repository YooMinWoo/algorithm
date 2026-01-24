package org.example._2026._01._24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[] charArray = br.readLine().toCharArray();
        int sum = 0;
        for(int i=0; i<N; i++){
            sum += (Integer.parseInt(String.valueOf(charArray[i])));
        }
        System.out.println(sum);
    }
}
