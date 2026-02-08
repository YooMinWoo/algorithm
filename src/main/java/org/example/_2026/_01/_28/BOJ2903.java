package org.example._2026._01._28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num = 2;
        int k = 1;

        for(int i=0; i<N; i++){
            num += k;
            k = k*2;
        }
        System.out.println(num*num);
    }
}
