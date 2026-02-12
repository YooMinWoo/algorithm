package org.example._2026._02._12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ1303 {
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int N;
    static int M;
    static char[][] chars;
    static boolean[][] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        M = Integer.parseInt(s[0]);
        N = Integer.parseInt(s[1]);
        chars = new char[N][M];
        visited = new boolean[N][M];
        for(int i=0; i<chars.length; i++){
            chars[i] = br.readLine().toCharArray();
        }
        System.out.println(bfs('W') + " " + bfs('B'));
    }

    private static int bfs(char soldier) {
        Queue<int[]> queue = new LinkedList<>();
        int result = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                int sum = 0;
                if(!visited[i][j] && chars[i][j] == soldier) {
                    queue.add(new int[]{i, j});
                    visited[i][j] = true;
                }
                while(!queue.isEmpty()){
                    sum++;
                    int[] poll = queue.poll();
                    int x = poll[0];
                    int y = poll[1];

                    for(int k=0; k<4; k++){
                        if(x+dx[k] >= 0 && y+dy[k] >= 0 && x+dx[k] < N && y+dy[k] < M &&
                                chars[x+dx[k]][y+dy[k]] == soldier && !visited[x+dx[k]][y+dy[k]]){
                            queue.add(new int[]{x+dx[k], y+dy[k]});
                            visited[x+dx[k]][y+dy[k]] = true;
                        }
                    }
                }
                result += (sum*sum);
            }
        }
        return result;
    }
}
