package org.example._2026._01._29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int cnt = 0;
        int result = 0;
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        for(int i=1; i<=a; i++){
            if(a%i == 0){
                cnt++;
                result = i;
            }
            if(cnt == b) break;
        }
        if(cnt == b) System.out.println(result);
        else System.out.println(0);

    }
}
