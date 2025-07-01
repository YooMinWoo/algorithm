package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11729 {

    static int cnt = 0;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        hanoi(N, 1, 3, 2);
        System.out.println(cnt);
        System.out.println(sb.toString());
    }

    static void hanoi(int N, int from, int to, int via){
        cnt++;
        if(N == 1){
            sb.append(from + " " + to + "\n");
            return;
        }
        hanoi(N-1, from, via, to);
        sb.append(from + " " + to + "\n");
        hanoi(N-1, via, to, from);
    }
}
