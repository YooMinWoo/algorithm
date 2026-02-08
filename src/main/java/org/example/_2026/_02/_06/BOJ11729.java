package org.example._2026._02._06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11729 {
    static StringBuilder sb = new StringBuilder();
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        hanoi(N,1,3,2);
        System.out.println(cnt);
        System.out.println(sb);
    }

    private static void hanoi(int n, int from, int to, int via){
        cnt++;
        if(n == 1) {
            sb.append(from).append(" ").append(to).append("\n");
            return;
        }
        hanoi(n-1, from, via, to);
        sb.append(from).append(" ").append(to).append("\n");
        hanoi(n-1, via, to, from);
    }
}
