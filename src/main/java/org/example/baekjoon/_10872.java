package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10872 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println(factorial(num));
    }

    public static int factorial(int i){
        if(i == 1 || i == 0) return 1;
        return i * factorial(i-1);
    }
}
