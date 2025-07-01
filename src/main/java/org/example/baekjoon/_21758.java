package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _21758 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] box = new int[N];

        for(int i=0; i<N; i++){
            box[i] = Integer.parseInt(input[i]);
        }

        long max = 0;

        /*
        벌 벌 통
        벌 통 벌
        통 벌 벌
         */


        // 벌 벌 통
        // 첫 번째 벌은 0에 위치. 통은 가장 끝
        for(int i=1; i<N-1; i++){
            long sum = 0;

            // 왼쪽 벌이 줍는거
            for(int j=1; j<N; j++){
                if(i!=j) sum += box[j];
            }
            for(int j=i+1; j<N; j++){
                sum += box[j];
            }
            if(sum > max) max = sum;
        }

        // 통 벌 벌
        for(int i=N-2; i>0; i--){
            long sum = 0;

            // 오른쪽 벌이 줍는거
            for(int j=N-2; j>=0; j--){
                if(i!=j) sum += box[j];
            }
            for(int j=i-1; j>=0; j--){
                sum += box[j];
            }
            if(sum > max) max = sum;
        }

        // 벌 통 벌
        for(int i=1; i<N-1; i++){
            long sum = 0;

            // 왼쪽 벌이 줍는거
            for(int j=1; j<=i; j++){
                sum += box[j];
            }
            // 오른쪽 벌이 줍는거
            for(int j=N-2; j>=i; j--){
                sum += box[j];
            }
            if(sum > max) max = sum;
        }

        System.out.println(max);

//        for(int i=1; i<5; i++){
//            long sum = 0;
//
//            // 왼쪽 벌이 줍는거
//            for(int j=1; j<6; j++){
//                if(i!=j) System.out.print(j+" ");
//            }
//            System.out.println();
//            for(int j=i+1; j<6; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//            System.out.println();
//        }
//
//        for(int i=4; i>0; i--){
//
//            // 오른쪽 벌이 줍는거
//            for(int j=4; j>=0; j--){
//                if(i!=j) System.out.print(j+" ");
//            }
//            System.out.println();
//            for(int j=i-1; j>=0; j--){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//            System.out.println();
//        }

//        for(int i=1; i<6-1; i++){
//
//            // 왼쪽 벌이 줍는거
//            for(int j=1; j<=i; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//            // 오른쪽 벌이 줍는거
//            for(int j=6-2; j>=i; j--){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//            System.out.println();
//        }
    }
}
