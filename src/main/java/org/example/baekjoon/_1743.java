package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class _1743 {
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    static boolean[][] visited;
    static int[][] depth;
    static int[][] trash;

    static int n;
    static int m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);

        visited = new boolean[n+1][m+1];
        depth = new int[n+1][m+1];
        trash = new int[n+1][m+1];

        int k = Integer.parseInt(input[2]);

        for(int i=0; i<k; i++){
            input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);

            trash[x][y] = 1;
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(!visited[i][j] && trash[i][j] == 1){
                    int size = bfs(i,j);
                    System.out.println(size);
                }
            }
        }
        System.out.println();
    }

    static int bfs(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x,y});
        visited[x][y] = true;

        int count = 1;

        while(!queue.isEmpty()){
            int[] now = queue.poll();
            int cx = now[0];
            int cy = now[1];

            for(int i=0; i<4; i++){
                int nx = cx+dx[i];
                int ny = cy+dy[i];

                if(nx <= 0 || ny <= 0 || nx > n || ny > m) continue;
                if(!visited[nx][ny] && trash[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    queue.offer(new int[]{nx,ny});
                    count++;
                }
            }
        }
        return count;
    }
}
