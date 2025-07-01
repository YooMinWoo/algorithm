package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] trees = new int[N];
        int treeIdx = 0;

        int min = 0;
        int max = 0;

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()){
            trees[treeIdx++] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(trees);
        min = 0;
        max = trees[N-1];
        int answer = 0;

        while(min <= max){
            long result = 0;
            int middle = (max + min) / 2;
            for(int i : trees){
                if(middle < i){
                    result += (i - middle);
                }
            }
            if(result >= M) {
                answer = middle;
                min = middle + 1;
            } else {
                max = middle - 1;
            }
        }
        System.out.println(answer);
    }
}
