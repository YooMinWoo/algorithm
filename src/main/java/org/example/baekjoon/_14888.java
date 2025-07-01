package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _14888 {

    static long min = 1_000_000_000;
    static long max = -1_000_000_000;
    static int N;
    static int[] signList = new int[4];
    static int[] numList;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        int[] visited = new int[4];

        numList = new int[N];

        for(int i=0; i<N; i++){
            numList[i] = Integer.parseInt(input[i]);
        }

        input = br.readLine().split(" ");

        for(int i=0; i<4; i++){
            signList[i] = Integer.parseInt(input[i]);
        }


        visit(0, numList[0]);
        System.out.println(max);
        System.out.println(min);
    }
    static void visit(int depth, int current){
        if(depth == N-1){
            if(current > max) max = current;
            if(current < min) min = current;
            return;
        }

        for(int i=0; i<4; i++){
            if(signList[i] > 0){
                signList[i]--;

                int next = numList[depth+1];
                int result = current;

                if(i == 0) result += next;
                else if (i == 1) result -= next;
                else if (i == 2) result *= next;
                else if (i == 3) {
                    if(current < 0){
                        result = -(-current / next);
                    } else{
                        result = current / next;
                    }
                }

                visit(depth+1, result);
                signList[i]++;
            }
        }
    }
}
