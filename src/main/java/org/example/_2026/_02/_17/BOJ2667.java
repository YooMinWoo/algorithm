package org.example._2026._02._17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ2667 {
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,1,-1};

    static boolean[][] visited;
    static int[][] house;

    static List<Integer> result = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        house = new int[N][N];
        visited = new boolean[N][N];
        for(int i=0; i<N; i++){
            String s = br.readLine();
            for(int j=0; j<N; j++){
                if(s.charAt(j) == '0') house[i][j] = 0;
                else house[i][j] = 1;
            }
        }
        bfs();
        Collections.sort(result);
        System.out.println(result.size());
        for(int i=0; i<result.size(); i++){
            System.out.println(result.get(i));
        }
    }

    public static void bfs(){
        Queue<int[]> queue = new LinkedList();
        for(int i=0; i<house.length; i++){
            for(int j=0; j<house.length; j++){
                if(!visited[i][j] && house[i][j] == 1){
                    queue.add(new int[]{i,j});
                    visited[i][j] = true;
                    int cnt = 1;
                    while(!queue.isEmpty()){
                        int[] poll = queue.poll();
                        int cx = poll[0];
                        int cy = poll[1];

                        for(int k=0; k<4; k++){
                            if(cx+dx[k] >= 0 && cx+dx[k] < house.length && cy+dy[k] >= 0 && cy+dy[k] < house.length){
                                if(house[cx+dx[k]][cy+dy[k]] == 1 && !visited[cx+dx[k]][cy+dy[k]]){
                                    queue.add(new int[]{cx+dx[k],cy+dy[k]});
                                    visited[cx+dx[k]][cy+dy[k]] = true;
                                    cnt++;
                                }
                            }
                        }
                    }
                    result.add(cnt);
                }
            }
        }
    }
}
