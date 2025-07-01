package org.example.baekjoon;

import java.io.*;

public class _2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[2001];

        for(int i=0; i<N; i++){
            int idx = Integer.parseInt(br.readLine()) + 1000;
            arr[idx] = idx;
        }

        for(Integer i : arr){
            if(i != null) bw.write(i - 1000);
        }
        bw.flush();
    }
}
