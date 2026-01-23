package org.example._2026._01._23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] student = new int[30];

        for(int i=0; i<28; i++){
            int num = Integer.parseInt(br.readLine());
            student[num-1] = 1;
        }

        for(int i=0; i<student.length; i++){
            if(student[i] == 0) System.out.println(i+1);
        }
    }
}
