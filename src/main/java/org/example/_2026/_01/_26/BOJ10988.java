package org.example._2026._01._26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        sb.append(s);
        sb.reverse();

        System.out.println(sb.toString().equals(s) ? 1 : 0);
    }
}
