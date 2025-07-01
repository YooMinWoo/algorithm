package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class _2178 {
    static int N, M;
    static int[][] map;
    static boolean[][] visited;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        map = new int[N][M];
        visited = new boolean[N][M];

        for(int i=0; i<N; i++){
            char[] charArray = br.readLine().toCharArray();
            for(int j=0; j<M; j++){
                map[i][j] = charArray[j] - '0';
            }
        }
        bfs(0,0);

        System.out.println(map[N-1][M-1]);
    }

    static void bfs(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;

        while(!queue.isEmpty()){
            int[] now = queue.poll();
            int currentX = now[0];
            int currentY = now[1];

            for(int i=0; i<4; i++){
                int nowX = currentX + dx[i];
                int nowY = currentY + dy[i];

                if(nowX < 0 || nowY < 0 || nowX >= N || nowY >= M) continue;

                if(map[nowX][nowY] == 0 || visited[nowX][nowY]) continue;

                queue.offer(new int[]{nowX, nowY});
                visited[nowX][nowY] = true;
                map[nowX][nowY] = map[currentX][currentY] + 1;
            }
        }
    }
}
