package org.example._2026._02._19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1806 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int N = Integer.parseInt(s[0]);
        int S = Integer.parseInt(s[1]);
        int[] number = new int[N+1];
        int sum = 0;
        int cnt = Integer.MAX_VALUE;

        int left = 0;
        int right = 0;

        String[] s1 = br.readLine().split(" ");

        for(int i=0; i<s1.length; i++){
            number[i] = Integer.parseInt(s1[i]);
        }

        while(right<=N){
            if(sum < S){
                sum += number[right++];
            } else{
                cnt = Math.min(cnt, right-left);
                sum -= number[left++];
            }
        }
        System.out.println(cnt == Integer.MAX_VALUE ? 0 : cnt);
    }
}
