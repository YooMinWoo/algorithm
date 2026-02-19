package org.example._2026._02._19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ14719 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);

        s = br.readLine().split(" ");

        int[] value = new int[y];

        for(int i=0; i< value.length; i++){
            value[i] = Integer.parseInt(s[i]);
        }

        int answer = 0;

        for(int i=1; i<y-1; i++){
            int curr = value[i];
            int left = 0;
            int right = 0;

            for(int j=0; j<i; j++){
                if(left < value[j]) left = value[j];
            }

            for(int j=i+1; j<y; j++){
                if(right < value[j]) right = value[j];
            }

            int min = Math.min(left, right);
            if(min > curr) answer += min - curr;
        }
        System.out.println(answer);
    }
}
