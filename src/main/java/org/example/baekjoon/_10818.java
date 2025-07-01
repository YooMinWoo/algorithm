package org.example.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class _10818 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer nToken = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(nToken.nextToken());

        StringTokenizer numberToken = new StringTokenizer(br.readLine());

        int min = 0;
        int max = 0;

        for(int i=0; i<n; i++){
            int number = Integer.parseInt(numberToken.nextToken());
            if(i == 0) {
                min = number;
                max = number;
                continue;
            }
            if(number < min) min = number;
            if(number > max) max = number;
        }
        bw.write(min + " " + max);
        bw.flush();
    }
}
