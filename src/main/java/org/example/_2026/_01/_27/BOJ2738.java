package org.example._2026._01._27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        int[][] ints = new int[N][M];

        for(int i=0; i<N; i++){
            String[] split = br.readLine().split(" ");
            for(int j=0; j<M; j++){
                int k = Integer.parseInt(split[j]);
                ints[i][j] = ints[i][j] + k;
            }
        }
        for(int i=0; i<N; i++){
            String[] split = br.readLine().split(" ");
            for(int j=0; j<M; j++){
                int k = Integer.parseInt(split[j]);
                ints[i][j] = ints[i][j] + k;
            }
        }
        for (int[] a : ints) {
            for (int i : a) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
