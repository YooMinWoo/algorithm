package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _2644 {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int[] depth;

    static int n;
    static int m;
    static int start;
    static int end;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        start = Integer.parseInt(input[0]);
        end = Integer.parseInt(input[1]);
        m = Integer.parseInt(br.readLine());

        // 초기화
        graph = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        depth = new int[n + 1];

        for(int i=1; i<=n; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<m; i++){
            input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            graph[a].add(b);
            graph[b].add(a);
        }
        bfs(start);

        System.out.println(depth[end] == 0 ? -1 : depth[end]);
    }
    static void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        depth[start] = 0;

        while (!queue.isEmpty()){
            int current = queue.poll();

            for(int next : graph[current]){
                if(!visited[next]){
                    visited[next] = true;
                    depth[next] = depth[current] + 1;
                    queue.add(next);
                }
            }
        }
    }
}
