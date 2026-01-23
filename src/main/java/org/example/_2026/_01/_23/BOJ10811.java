package org.example._2026._01._23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        int[] bowl = new int[N];
        for(int i=1; i<=N; i++){
            bowl[i-1] = i;
        }
        for(int i=0; i<M; i++){
            String[] s1 = br.readLine().split(" ");
            int start = Integer.parseInt(s1[0]) - 1;
            int end = Integer.parseInt(s1[1]) - 1;

            int left = start;
            int right = end;
            while(true){
                if(left >= right) break;
                int a = bowl[left];
                bowl[left] = bowl[right];
                bowl[right] = a;
                left++;
                right--;
            }
        }
        for(int i=0; i<N; i++){
            System.out.print(bowl[i]);
            if(i+1 < N) System.out.print(" ");
        }
    }
}
