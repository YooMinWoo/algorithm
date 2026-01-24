package org.example._2026._01._24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strip = br.readLine().strip();
        if(strip.equals("")) {
            System.out.println(0);
            return;
        }
        String[] s = strip.split(" ");
        System.out.println(s.length);
    }
}
