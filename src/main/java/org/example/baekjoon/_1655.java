package org.example.baekjoon;


import java.io.*;
import java.util.StringTokenizer;

public class _1655 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        bw.write(st.nextToken());
        bw.flush();
    }
}
