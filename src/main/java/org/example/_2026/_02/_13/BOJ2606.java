package org.example._2026._02._13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ2606 {

    static int[][] graph;
    static boolean[] visited;
    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        graph = new int[N+1][N+1];
        visited = new boolean[N+1];
        for(int i=0; i<M; i++){
            String[] s = br.readLine().split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);
            graph[x][y] = 1;
            graph[y][x] = 1;
        }
        Queue<int[]> queue = new LinkedList<>();
        visited[1] = true;
        for(int i=1; i<graph.length; i++){
            if(graph[1][i] == 1 && !visited[i]){
                queue.add(new int[]{1,i});
                visited[i] = true;
                result++;
            }
        }
        bfs(queue);
        System.out.println(result);
    }

    private static void bfs(Queue<int[]> queue){
        while(!queue.isEmpty()){
            int[] poll = queue.poll();
            int x = poll[0];
            int y = poll[1];
            for(int i=1; i<graph.length; i++){
                if(graph[y][i] == 1 && !visited[i]){
                    queue.add(new int[]{y,i});
                    visited[i] = true;
                    result++;
                }
            }
        }
    }
}
