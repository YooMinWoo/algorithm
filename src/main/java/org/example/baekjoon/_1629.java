package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1629 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        StringTokenizer st = new StringTokenizer(br.readLine());
//        long A = Integer.parseInt(st.nextToken());
//        long B = Integer.parseInt(st.nextToken());
//        long C = Integer.parseInt(st.nextToken());

        long A = 2;
        long B = 6;
        long C = 11;
        A의B제곱(A,B,C);
    }

    public static void A의B제곱(long A, long B, long C){
        for(int i=0; i<B; i++){
            System.out.println("A의 값: "+A+", C로 나눈 나머지 값: "+A%C);
            System.out.println("A의 값: "+A+", C로 나눈 몫: "+A/C);
            A *= A;
        }

    }
}
