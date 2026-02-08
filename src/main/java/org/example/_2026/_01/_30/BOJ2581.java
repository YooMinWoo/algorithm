package org.example._2026._01._30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        List<Integer> nums = new ArrayList<>();
        boolean tf = false;
        for(int i=M; i<=N; i++){
            if(i==1) continue;
            for(int j=2; j<i; j++){
                if(i%j == 0){
                    tf = true;
                    break;
                }
            }
            if(!tf) nums.add(i);
            tf = false;
        }
        int sum = 0;
        for (Integer num : nums) {
            sum += num;
        }
        if(sum == 0){
            System.out.println(-1);
        } else{
            System.out.println(sum);
            System.out.println(nums.get(0));
        }
    }
}
