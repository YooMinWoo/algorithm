package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class _7562 {

    static int[] dx = {-2,-2,-1,-1,1,1,2,2};
    static int[] dy = {1,-1,2,-2,2,-2,1,-1};

    static int[][] start;
    static int[][] end;
    static boolean[][] visited;

    static int m;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            count = 0;
            m = Integer.parseInt(br.readLine());
            start = new int[m][m];
            end = new int[m][m];
            visited = new boolean[m][m];
            String[] input = br.readLine().split(" ");

            int startX = Integer.parseInt(input[0]);
            int startY = Integer.parseInt(input[1]);

//            start[startX][startY] = 1;

            input = br.readLine().split(" ");

            int endX = Integer.parseInt(input[0]);
            int endY = Integer.parseInt(input[1]);

            end[endX][endY] = 1;

            bfs(startX,startY);
            sb.append(count);
            if(i != n-1) sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    static void bfs(int x, int y){
        // 현재위치
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x,y});

        while(!queue.isEmpty()){
            int[] now = queue.poll();
            int cx = now[0];
            int cy = now[1];

            if(end[cx][cy] == 1){
                count = start[cx][cy];
                return;
            }

            for(int i=0; i<8; i++){
                int nx = cx+dx[i];
                int ny = cy+dy[i];

                if(nx<0 || ny<0 || nx>=m || ny>=m) continue;
                if(visited[nx][ny]) continue;

                queue.offer(new int[]{nx,ny});
                visited[nx][ny] = true;
                start[nx][ny] = start[cx][cy] + 1;

            }
        }
    }
}
