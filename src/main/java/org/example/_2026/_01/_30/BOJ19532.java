package org.example._2026._01._30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ19532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);
        int d = Integer.parseInt(s[3]);
        int e = Integer.parseInt(s[4]);
        int f = Integer.parseInt(s[5]);

        int x = ((b*f) - (e*c)) / ((b*d) - (e*a));
        int y = b == 0 ? (f-d*x)/e : (c-a*x)/b;
        System.out.println(x + " " + y);
    }
}
