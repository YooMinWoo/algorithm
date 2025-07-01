package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class _1012 {

    static int[][] map;
    static int T,M,N,K;

    static boolean[][] visited;

    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            int count = 0;

            String[] input = br.readLine().split(" ");
            M = Integer.parseInt(input[0]);
            N = Integer.parseInt(input[1]);
            K = Integer.parseInt(input[2]);

            map = new int[N][M];
            visited = new boolean[N][M];

            for(int j=0; j<K; j++){
                int x,y;
                input = br.readLine().split(" ");
                x = Integer.parseInt(input[0]);
                y = Integer.parseInt(input[1]);

                map[y][x] = 1;
            }
            for(int a=0; a<N; a++){
                for(int b=0; b<M; b++){
                    if(map[a][b] == 1 && !visited[a][b]){
                        bfs(a,b);
                        count++;
                    }
                }
            }
            sb.append(count + "\n");
        }
        System.out.println(sb.toString().trim());
    }

    static void bfs(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x,y});
        while(!queue.isEmpty()){
            int[] poll = queue.poll();
            int cx = poll[0];
            int cy = poll[1];

            for(int i=0; i<4; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
                if(map[nx][ny] == 0 || visited[nx][ny]) continue;

                queue.offer(new int[]{nx,ny});
                visited[nx][ny] = true;
            }
        }
    }
}
