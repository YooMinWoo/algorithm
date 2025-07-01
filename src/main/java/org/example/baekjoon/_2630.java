package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 미해결
public class _2630 {
    static int[][] paperList;
    static int color;
    static int white;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        paperList = new int[N][N];

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] paper = new int[N];
            while(st.hasMoreTokens()){
                for(int j=0; j<N; j++){
                    paper[j] = Integer.parseInt(st.nextToken());
                }
            }
            paperList[i] = paper;
        }
        divide(0,0,N-1);
        System.out.println(white);
        System.out.println(color);
    }

    public static void divide(int x, int y, int size){
        boolean onlyColor = true;
        for(int i = x; i < x + size; i++){
            for(int j = y; j < y + size; j++){
                if(paperList[i][j] == 0) {
                    onlyColor = false;
                    break;
                }
            }
            if(!onlyColor) break;
        }
        if(onlyColor){
            color++;
            return;
        } else {
            white++;
        }

        int half = size / 2;
        divide(x, y, half);
        divide(x+half, y, half);
        divide(x, y+half, half);
        divide(x+half, y+half, half);
    }

    public static boolean isSameColor(int x, int y, int size){
        for(int i = x; i < x + size; i++){
            for(int j = y; j < y + size; j++){
                if(paperList[i][j] == 0) return false;
            }
        }
        return true;
    }
}
