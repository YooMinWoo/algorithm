package org.example._2026._01._27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        String last = "";
        for(int i=0; i<N; i++){
            boolean success = true;
            String s = br.readLine();
            for (char c : s.toCharArray()) {
                if(sb.toString().contains(String.valueOf(c)) && !last.equals(String.valueOf(c))){
                    success = false;
                    break;
                }
                last = String.valueOf(c);
                sb.append(last);
            }
            if(success) sum++;
            sb = new StringBuilder();
        }
        System.out.println(sum);
    }
}
