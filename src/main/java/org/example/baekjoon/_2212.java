package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2212 {

    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        int K = Integer.parseInt(br.readLine());
//
//        String[] input = br.readLine().split(" ");
//        int[] sensors = new int[N];
//
//        for(int i=0; i<input.length; i++){
//            sensors[i] = Integer.parseInt(input[i]);
//        }
//
//        Arrays.sort(sensors);
//
//        int min = sensors[sensors.length - 1] - sensors[0];

        /*
        만일 6개의 요소를 가지고 있는 배열이 있을 때, 이것을 2개로 나누는 것은
        [1] / [2,3,4,5,6]
        [1,2] / [3,4,5,6]
        [1,2,3] / [4,5,6]
        [1,2,3,4] / [5,6]
        [1,2,3,4,5] / [6]

        6개의 요소를 가지고 있는 배열이 있을 때, 이것을 3개로 나누는 것은
        [1] / [2] / [3,4,5,6]

         */
    }
}
