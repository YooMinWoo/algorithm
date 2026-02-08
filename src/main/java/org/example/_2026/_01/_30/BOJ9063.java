package org.example._2026._01._30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int maxX = Integer.MIN_VALUE;
        int minX = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        if(N == 1) {
            System.out.println(0);
            return;
        }
        for(int i=0; i<N; i++){
            String[] s = br.readLine().split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);

            if(x > maxX) maxX = x;
            if(x < minX) minX = x;
            if(y > maxY) maxY = y;
            if(y < minY) minY = y;
        }
        System.out.println((maxX - minX) * (maxY - minY));
    }
}
