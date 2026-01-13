package org.example._2026._01._13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1000 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();

        String[] s = inputStr.split(" ");

        System.out.println(Integer.parseInt(s[0]) + Integer.parseInt(s[1]));
    }
}
