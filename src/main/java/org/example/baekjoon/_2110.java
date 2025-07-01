package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _2110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int[] cList = new int[N];

        for(int i=0; i<N; i++){
            cList[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(cList);
        int start = 1;
        int end = cList[N-1] - cList[0];
        int answer = 0;

        while(start <= end){
            int mid = (start + end) / 2;
            int cnt = 0;
            int compareNumber = cList[0];
            for(int i=1; i<N; i++){
                if(cList[i] - compareNumber >= mid){
                    cnt++;
                    compareNumber = cList[i];
                }
            }
            if(cnt >= C-1){
                answer = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(answer);
    }
}
