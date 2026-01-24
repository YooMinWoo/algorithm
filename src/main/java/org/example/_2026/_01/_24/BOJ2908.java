package org.example._2026._01._24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        String s0 = s[0];
        String s1 = s[1];
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        for(int i=s0.length()-1; i>=0; i--){
            a.append(s0.charAt(i));
        }
        for(int i=s1.length()-1; i>=0; i--){
            b.append(s1.charAt(i));
        }
        System.out.println(Math.max(Integer.parseInt(a.toString()), Integer.parseInt(b.toString())));
    }
}
