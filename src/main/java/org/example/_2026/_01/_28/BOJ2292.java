package org.example._2026._01._28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 1;
        int left = 1;
        int right = 1;
        int plus = 0;
        while(true){
            if(N>=left && N <= right){
                break;
            }
            result++;
            plus += 6;
            left = right+1;
            right += plus;
        }
        System.out.println(result);
    }
}
