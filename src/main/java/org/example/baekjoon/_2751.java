package org.example.baekjoon;

import java.io.*;
import java.util.Arrays;

public class _2751 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int N = Integer.parseInt(br.readLine());
//        int[] arr = new int[N];
//
//        for(int i=0; i<N; i++){
//            arr[i] = Integer.parseInt(br.readLine());
//        }
//        Arrays.sort(arr);
//        for(int i : arr){
//            bw.write(i + "\n");
//        }
//        bw.flush();
//        bw.close();
//    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[2000001];

        for(int i=0; i<N; i++){
            int idx = Integer.parseInt(br.readLine()) + 1000000;
            arr[idx] = idx;
        }

        for(Integer i : arr){
            if(i != null) bw.write(i - 1000000 + "\n");
        }
        bw.flush();
    }
}
