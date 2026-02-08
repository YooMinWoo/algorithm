package org.example._2026._02._05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int A = 0;
        int B = 0;

        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        boolean[][] board = new boolean[N][M];

        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<M; j++){
                if(str.charAt(j) == 'W'){
                    board[i][j] = true;
                } else {
                    board[i][j] = false;
                }
            }
        }

        boolean TF = board[0][0];

        int min = Integer.MAX_VALUE;
        for(int i=0; i<N-7; i++){
            for(int j=0; j<M-7; j++){
                int cnt = 0;
                for(int x=i; x<i+8; x++){
                    for(int y=j; y<j+8; y++){
                        if(board[x][y] != TF) cnt++;
                        TF = !TF;
                    }
                    TF = !TF;
                }
                min = Math.min(Math.min(64-cnt, cnt), min);
            }
        }
        System.out.println(min);
    }
}
