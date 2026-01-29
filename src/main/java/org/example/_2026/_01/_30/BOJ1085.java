package org.example._2026._01._30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);
        int w = Integer.parseInt(s[2]);
        int h = Integer.parseInt(s[3]);

        System.out.println(Math.min(Math.min(x,y), Math.min(w-x, h-y)));
    }
}
