package org.example._2026._02._03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ2178 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        int[][] miro = new int[N][M];

        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<str.length(); j++){
                miro[i][j] = str.charAt(j) - '0';
            }
        }

        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        q.add(0);
        int[][] visited = new int[N][M];
        visited[0][0] = 1;
        while(!q.isEmpty()){
            int x = q.remove();
            int y = q.remove();
            for(int i=0; i<4; i++){
                int nx = x+dx[i];
                int ny = y+dy[i];
                if(nx >= 0 && ny >= 0 && nx < N && ny < M && visited[nx][ny] == 0 && miro[nx][ny] == 1){
                    q.add(nx);
                    q.add(ny);
                    visited[nx][ny] = visited[x][y] + 1;
                }
            }
        }
        System.out.println(visited[N-1][M-1]);
    }

}
