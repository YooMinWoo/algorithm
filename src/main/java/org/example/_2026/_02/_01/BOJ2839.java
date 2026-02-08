package org.example._2026._02._01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a = n/5;
        boolean result = true;
        if(n%5 == 0){
            System.out.println(a);
            return;
        }
        for(int i=n/5; i>=0; i--){
            if(n%5 == 0){
                System.out.println(i);
                result = false;
                break;
            } else if((n-5*i)%3 == 0){
                System.out.println(i + ((n-5*i) / 3));
                result = false;
                break;
            }
        }
        if(result) System.out.println(-1);
    }
}
