package org.example._2026._02._06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(factorial(N));
    }
    public static int factorial(int n){
        if(n > 1){
            return n * factorial(n-1);
        } else return 1;
    }
}
