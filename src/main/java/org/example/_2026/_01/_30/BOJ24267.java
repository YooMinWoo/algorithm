package org.example._2026._01._30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ24267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long cnt = 0;
        for(long i=n-2; i>=1; i--){
            cnt = cnt + i*(n-1-i);
        }
        System.out.println(cnt);
        System.out.println("3");
    }
}
