package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1463 {

    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
        int N = 15;
        int cnt = 0;

        while(N != 1){
            if(N % 3 == 0){
                N = N/3;
                cnt++;
            } else if(N % 2 == 0){
                N = N/2;
                cnt++;
            } else{
                N = N-1;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
