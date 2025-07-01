package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _11650 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] points = new int[N][2];
        for(int i=0; i<N; i++){
            String[] split = br.readLine().split(" ");
            points[i][0] = Integer.parseInt(split[0]);
            points[i][1] = Integer.parseInt(split[1]);
        }

//        Arrays.sort(points, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                if(o1[0] == o2[0]){
//                    return Integer.compare(o1[1], o2[1]);
//                }
//                return Integer.compare(o1[0], o2[0]);
//            }
//        });

        Arrays.sort(points, (int[] o1, int[] o2) -> {
            if(o1[0] == o2[0]) return Integer.compare(o1[1], o2[1]);
            return Integer.compare(o1[0], o2[0]);
        });

        for (int[] i : points){
            System.out.println(i[0] + " " + i[1]);
        }
    }
}
