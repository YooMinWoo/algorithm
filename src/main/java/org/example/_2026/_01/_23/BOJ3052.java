package org.example._2026._01._23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] remainders = new int[42];
        int cnt = 0;
        for(int i=0; i<10; i++){
            int num = Integer.parseInt(br.readLine());
            int a = num % 42;

            remainders[a] = 1;
        }
        for(int remainder : remainders){
            if(remainder == 1) cnt++;
        }
        System.out.println(cnt);
    }
}
