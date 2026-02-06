package org.example._2026._02._06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        for(int i=0; i<N; i++){
            numbers[i] = Integer.parseInt(br.readLine());
        }
        for(int i=0; i<N-1; i++){
            int idx = 0;
            int min = Integer.MAX_VALUE;
            for(int j=i+1; j<N; j++){
                if(min > numbers[j]) {
                    min = numbers[j];
                    idx = j;
                }
            }
            if(numbers[i] > min){
                numbers[idx] = numbers[i];
                numbers[i] = min;
            }
        }
        for(int i=0; i<N; i++){
            System.out.println(numbers[i]);
        }
    }
}
