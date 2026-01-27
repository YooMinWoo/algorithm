package org.example._2026._01._27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] strings = new String[5][15];
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<5; i++){
            char[] charArray = br.readLine().toCharArray();
            for(int j=0; j<charArray.length; j++){
                strings[i][j] = String.valueOf(charArray[j]);
            }
        }
        for(int j=0; j<15; j++){
            for(int i=0; i<5; i++){
                String s = strings[i][j];
                if(s != null) sb.append(s);
            }
        }
        System.out.println(sb);
    }
}
