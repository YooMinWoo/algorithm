package org.example._2026._01._30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        int max = 0;
        s = br.readLine().split(" ");
        for(int i=0; i<N-2; i++){
            for(int j=i+1; j<N-1; j++){
                for(int k=j+1; k<N; k++){
                    int sum = Integer.parseInt(s[i]) +
                              Integer.parseInt(s[j]) +
                              Integer.parseInt(s[k]);
                    if(sum > max && sum <= M) max = sum;
                }
            }
        }
        System.out.println(max);
    }
}
