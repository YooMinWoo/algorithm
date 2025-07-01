package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class _11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<=N; i++){
            queue.offer(i);
        }

        int cnt = 1;
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while(true){
            if(cnt % K == 0) {
                sb.append(queue.remove());
                cnt++;
                if(queue.isEmpty()) {
                    sb.append(">");
                    break;
                }
                sb.append(", ");
                continue;
            }
            queue.offer(queue.remove());
            cnt++;
        }
        System.out.println(sb.toString());
    }
}
