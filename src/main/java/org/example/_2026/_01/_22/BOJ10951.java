package org.example._2026._01._22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            try{
                String[] s = br.readLine().split(" ");
                System.out.println(Integer.parseInt(s[0]) + Integer.parseInt(s[1]));
            } catch (RuntimeException e){
                break;
            }
        }
    }
}
