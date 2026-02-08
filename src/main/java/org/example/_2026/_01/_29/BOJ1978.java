package org.example._2026._01._29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int result = 0;
        for(int i=0; i<N; i++){
            int number = Integer.parseInt(s[i]);
            if(number == 1) continue;
            boolean check = true;
            for(int j=2; j<number; j++){
                if(number%j == 0){
                    check = false;
                    break;
                }
            }
            if(check) result++;
        }
        System.out.println(result);
    }
}
