package org.example._2026._02._01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        int[][] a = new int[N][2];
        for(int i=0; i<N; i++){
            String[] s = br.readLine().split(" ");
            a[i][0] = Integer.parseInt(s[0]);
            a[i][1] = Integer.parseInt(s[1]);
        }
        Arrays.sort(a, (o1, o2) -> {
            if(o1[1] == o2[1]){
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });
        int last = 0;

        for (int[] i : a) {
            if(i[0] >= last){
                last = i[1];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
