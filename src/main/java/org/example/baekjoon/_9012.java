package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9012 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++){
            String test = br.readLine();
            int cnt = 0;
            for(char c : test.toCharArray()){
                if(c == '(') cnt++;
                else cnt--;

                if(cnt < 0) break;
            }
            if(cnt !=0){
                sb.append("NO");
            } else {
                sb.append("YES");
            }
            if(i != N-1){
                sb.append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
