package org.example._2026._02._13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ1743 {
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static int N;
    static int M;
    static int K;

    static int[][] trash;
    static boolean[][] visited;

    static int result = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        N = Integer.parseInt(s[0]);
        M = Integer.parseInt(s[1]);
        K = Integer.parseInt(s[2]);

        trash = new int[N][M];
        visited = new boolean[N][M];

        for(int i=0; i<K; i++){
            String[] s1 = br.readLine().split(" ");
            int x = Integer.parseInt(s1[0]);
            int y = Integer.parseInt(s1[1]);
            trash[x-1][y-1] = 1;
        }

        Queue<int []> queue = new LinkedList<>();

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(trash[i][j] == 1 && !visited[i][j]){
                    queue.add(new int[]{i,j});
                    visited[i][j] = true;
                }
                bfs(queue);
            }
        }
        System.out.println(result);
    }
    private static void bfs(Queue<int []> queue){
        int sum = 0;
        while (!queue.isEmpty()){
            int[] poll = queue.poll();
            int x = poll[0];
            int y = poll[1];
            sum++;

            for(int i=0; i<4; i++){
                if(x+dx[i] >= 0 && x+dx[i] < N && y+dy[i] >= 0 && y+dy[i] < M){
                    if(trash[x+dx[i]][y+dy[i]] == 1 && !visited[x+dx[i]][y+dy[i]]){
                        queue.add(new int[]{x+dx[i], y+dy[i]});
                        visited[x+dx[i]][y+dy[i]] = true;
                    }
                }
            }
        }
        if(result < sum) result = sum;
    }
}
