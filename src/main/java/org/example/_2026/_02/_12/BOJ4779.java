package org.example._2026._02._12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ4779 {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String s = br.readLine();
            if(s == null) break;
            int N = Integer.parseInt(s);
            double pow = Math.pow(3, N);
            String str = "-".repeat((int)pow);
            a(str);
            System.out.println(sb);
            sb = new StringBuilder();
        }
    }

    public static void a(String str){
        if(str.length() == 1 || str.isBlank()) {
            sb.append(str);
            return;
        }
        int length = (str.length()+1) / 3;
        String s;
        for(int i=0; i<str.length(); i+=length){
            if(i%2 == 0){
                s = str.substring(i, i+length);
            } else{
                s = " ".repeat(length);
            }
            a(s);
        }
    }
}
