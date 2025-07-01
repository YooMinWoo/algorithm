package org.example.baekjoon;


import java.io.*;

public class _2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int index = 1;
        int max = 0;

        for(int i=1; i<=9; i++){
            int N = Integer.parseInt(br.readLine());
            if(N > max) {
                max = N;
                index = i;
            }
        }
        bw.write(max + "\n");
        bw.write(index + "\n");
        bw.flush();
    }
}
