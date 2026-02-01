package org.example._2026._02._01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);

        int[] coins = new int[N];
        int sum = 0;

        for(int i=0; i<N; i++){
            coins[i] = Integer.parseInt(br.readLine());
        }
        for(int i=coins.length-1; i>=0; i--){
            int coin = coins[i];
            sum += K/coin;
            K = K%coin;
            if(K == 0) break;
        }
        System.out.println(sum);
    }
}
