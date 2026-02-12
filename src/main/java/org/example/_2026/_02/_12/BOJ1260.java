package org.example._2026._02._12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ1260 {
    static int[][] graph;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        int V = Integer.parseInt(s[2]);

        graph = new int[N+1][N+1];
        visited = new boolean[N+1];
        for(int i=0; i<M; i++){
            String[] s1 = br.readLine().split(" ");
            graph[Integer.parseInt(s1[0])][Integer.parseInt(s1[1])] = 1;
            graph[Integer.parseInt(s1[1])][Integer.parseInt(s1[0])] = 1;
        }
        dfs(V);
        System.out.println();
        visited = new boolean[N+1];
        bfs(V);
    }

    public static void dfs(int start){
        visited[start] = true;
        System.out.print(start + " ");
        for(int i=1; i<graph.length; i++){
            if(graph[start][i] == 1 && !visited[i]){
                dfs(i);
            }
        }
    }

    public static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        System.out.print(start + " ");
        while (!q.isEmpty()){
            Integer poll = q.poll();
            for(int i=1; i<graph.length; i++){
                if(graph[poll][i] == 1 && !visited[i]){
                    System.out.print(i + " ");
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }
}
