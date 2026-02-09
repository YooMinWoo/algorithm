package org.example._2026._02._09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class BOJ1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Integer[] A = new Integer[N];
        Integer[] B = new Integer[N];
        String[] s = br.readLine().split(" ");
        int result = 0;
        for(int i=0; i<s.length; i++){
            A[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(A);

        s = br.readLine().split(" ");
        for(int i=0; i<s.length; i++){
            B[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(B, Collections.reverseOrder());

        for(int i=0; i<N; i++){
            result += A[i]*B[i];
        }
        System.out.println(result);
    }
}
