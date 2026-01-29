package org.example._2026._01._29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);

            if(a == 0 && b == 0) break;
            if(b%a == 0) System.out.println("factor");
            else if(a%b == 0) System.out.println("multiple");
            else System.out.println("neither");
        }
    }
}
