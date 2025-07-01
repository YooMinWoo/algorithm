package org.example.baekjoon;


import java.io.*;

public class _8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 정수 하나 읽기
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            String ox = br.readLine();
            char[] charArray = ox.toCharArray();
            int j = 1;
            int result = 0;
            for(char c : charArray){
                if(c == 'O'){
                    result += j;
                    j++;
                } else{
                    j = 1;
                }
            }
            bw.write(result+"\n");
        }
        bw.flush();
    }
}
