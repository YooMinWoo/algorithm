package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10819 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean[] visited = new boolean[N];
        permute(N, visited);
    }

    public static void permute(int depth, boolean[] visited){
        for(int i=0; i<depth; i++){
            if(visited[i] == false){
                visited[i] = true;
                System.out.print(i);
                permute(depth, visited);
                visited[i] = false;
            }
        }
        System.out.println();
    }

}
