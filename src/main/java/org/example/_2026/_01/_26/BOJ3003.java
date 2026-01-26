package org.example._2026._01._26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] s = br.readLine().split(" ");

        for(int i=0; i<6; i++){
            if(i <= 1){
                sb.append(1 - Integer.parseInt(s[i])).append(" ");
            } else if (i == 5) {
                sb.append(8 - Integer.parseInt(s[i])).append(" ");
            } else {
                sb.append(2 - Integer.parseInt(s[i])).append(" ");
            }
        }
        System.out.println(sb);
    }
}
