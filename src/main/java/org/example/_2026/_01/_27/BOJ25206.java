package org.example._2026._01._27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a = 0;
        double b = 0;
        for(int i=0; i<20; i++){
            String[] s = br.readLine().split(" ");
            double v = Double.parseDouble(s[1]);
            a += v;
            if(s[2].equals("A+")){
                b += 4.5 * v;
            } else if(s[2].equals("A0")){
                b += 4.0 * v;
            } else if(s[2].equals("B+")){
                b += 3.5 * v;
            } else if(s[2].equals("B0")){
                b += 3.0 * v;
            } else if(s[2].equals("C+")){
                b += 2.5 * v;
            } else if(s[2].equals("C0")){
                b += 2.0 * v;
            } else if(s[2].equals("D+")){
                b += 1.5 * v;
            } else if(s[2].equals("D0")){
                b += 1.0 * v;
            } else if(s[2].equals("F")){
                b += 0.0 * v;
            } else if(s[2].equals("P")){
                a -= v;
            }
        }
        System.out.println(b/a);
    }
}
