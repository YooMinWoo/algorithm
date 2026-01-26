package org.example._2026._01._26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int result = s.length();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            String ab = "ab";
            if("ABC".contains(String.valueOf(c))){
                result += 2;
            } else if ("DEF".contains(String.valueOf(c))) {
                result += 3;
            } else if ("GHI".contains(String.valueOf(c))) {
                result += 4;
            } else if ("JKL".contains(String.valueOf(c))) {
                result += 5;
            } else if ("MNO".contains(String.valueOf(c))) {
                result += 6;
            } else if ("PQRS".contains(String.valueOf(c))) {
                result += 7;
            } else if ("TUV".contains(String.valueOf(c))) {
                result += 8;
            } else if ("WXYZ".contains(String.valueOf(c))) {
                result += 9;
            }
        }
        System.out.println(result);
    }
}
