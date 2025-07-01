package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _16564 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        int[] cList = new int[N];

        for(int i=0; i<N; i++){
            cList[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(cList);

        long start = cList[0];
        long end = cList[N-1] + T;
        long answer = 0;

        while(start <= end){
            long mid = (start + end) / 2;
            long gap = 0;
            for(int c : cList){
                if(mid > c) gap += mid - c;
            }
            if(gap <= T){
                answer = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(answer);
    }
}
