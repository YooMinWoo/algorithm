package org.example._2026._02._13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BOJ14888 {

    static int N;
    static int[] number;
    static int[] calculator = new int[4];
    static int MIN = Integer.MAX_VALUE;
    static int MAX = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        number = new int[N];
        String[] s = br.readLine().split(" ");
        for(int i=0; i<N; i++){
            number[i] = Integer.parseInt(s[i]);
        }
        s = br.readLine().split(" ");
        for(int i=0; i<4; i++){
            calculator[i] = Integer.parseInt(s[i]);
        }

        dfs(number[0], 1);
        System.out.println(MAX);
        System.out.println(MIN);
    }

    private static void dfs(int num, int idx){
        if(idx == N) {
            if(num < MIN) MIN = num;
            if(num > MAX) MAX = num;
        }
        for(int i=0; i<4; i++){
            if(calculator[i] > 0){
                calculator[i] = calculator[i]-1;
                if(i == 0){
                    dfs(num+number[idx], idx+1);
                } else if(i == 1){
                    dfs(num-number[idx], idx+1);
                } else if(i == 2){
                    dfs(num*number[idx], idx+1);
                } else if(i == 3){
                    dfs(num/number[idx], idx+1);
                }
                calculator[i] = calculator[i]+1;
            }
        }
    }
}
