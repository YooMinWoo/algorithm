package org.example._2026._01._27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);

        while(true){
            int i = N%B;
            N = N/B;
            if(i>=10){
                i += 55;
                sb.insert(0, (char) i);
            } else{
                sb.insert(0, i);
            }
            if(N == 0) break;
        }
        System.out.println(sb);
    }
}
