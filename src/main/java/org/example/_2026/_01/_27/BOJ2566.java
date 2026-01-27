package org.example._2026._01._27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = -1;
        int[] nums = new int[2];

        for(int i=0; i<9; i++){
            String[] s = br.readLine().split(" ");
            for(int j=0; j<9; j++){
                int num = Integer.parseInt(s[j]);
                if(num>max) {
                    max = num;
                    nums[0] = i+1;
                    nums[1] = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(nums[0] + " " + nums[1]);

    }
}
