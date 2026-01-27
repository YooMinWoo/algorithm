package org.example._2026._01._27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] ints = new int[100][100];
        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i=0; i<N; i++){
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);

            for(int j=a; j<a+10; j++){
                for(int k=b; k<b+10; k++){
                    ints[j][k] = 1;
                }
            }
        }
        for (int[] a : ints) {
            for (int i : a) {
                if(i==1) sum++;
            }
        }
        System.out.println(sum);
    }
}
