package org.example._2026._01._23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int v = Integer.parseInt(br.readLine());
        int result = 0;
        for(int i=0; i<N; i++){
            if(v == (Integer.parseInt(s[i]))) result ++;
        }
        System.out.println(result);
    }
}
