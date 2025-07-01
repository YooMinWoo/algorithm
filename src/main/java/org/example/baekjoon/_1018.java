package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1018 {

    static boolean[][] arr;
    static int result = 64;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        arr = new boolean[N][M];

        for(int i=0; i<N; i++){
            char[] charArray = br.readLine().toCharArray();
            for(int j=0; j<M; j++){
                if(charArray[j] == 'B') arr[i][j] = true;
                else arr[i][j] = false;
            }
        }

        for(int i=0; i<N-7; i++){
            for(int j=0; j<M-7; j++){
                check(i,j);
            }
        }

        System.out.println(result);
    }

    static void check(int x, int y){
        boolean TF = arr[x][y];
        int cnt1 = 0;
        for(int i=x; i<x+8; i++){
            for(int j=y; j<y+8; j++){
                if(arr[i][j] != TF) cnt1++;
                TF = !TF;
            }
            TF = !TF;
        }
        int min = Math.min(cnt1, 64 - cnt1);
        if(min < result) result = min;
    }
}
