package org.example._2026._01._15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ14720 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        String[] s = br.readLine().split(" ");
//
//        int curr = 2;
//        int cnt = 0;
//        for(String str : s){
//            int i = Integer.parseInt(str);
//            if(curr == 2 && i == 0) {
//                cnt++;
//                curr = i;
//            }
//            else if (curr == 0 && i == 1) {
//                cnt++;
//                curr = i;
//            }
//            else if (curr == 1 && i == 2) {
//                cnt++;
//                curr = i;
//            }
//        }
//        System.out.println(cnt);

        // 방법 2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int curr = 0;
        int answer = 0;

        for(int i=0; i<N; i++){
            int n = Integer.parseInt(st.nextToken());
            if(curr == n){
                curr = curr == 2 ? 0 : curr+1;
                answer++;
            }
        }
        System.out.println(answer);
    }
}
