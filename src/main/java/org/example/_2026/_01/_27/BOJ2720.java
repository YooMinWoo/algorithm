package org.example._2026._01._27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int[] money;
        for(int i=0; i<T; i++){
            int C = Integer.parseInt(br.readLine());
            money = new int[4];
            while(C > 0){
                if(C >= 25){
                    money[0] = C/25;
                    C %= 25;
                } else if(C >= 10){
                    money[1] = C/10;
                    C %= 10;
                } else if(C >= 5){
                    money[2] = C/5;
                    C %= 5;
                } else if(C >= 1){
                    money[3] = C/1;
                    C %= 1;
                }
            }
            sb.append(money[0]).append(" ").append(money[1]).append(" ").append(money[2]).append(" ").append(money[3]).append("\n");
        }
        System.out.println(sb);
    }
}
