package org.example._2026._01._28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        int curr = 1;
        int a = 0;
        int b = 0;
        boolean k = true;
        while(true){
            for(int i=1; i<=curr; i++){
                if(cnt == N){
                    k=false;
                    break;
                }
                if(curr%2 == 0){
                    a=i;
                    b=(curr+1-i);
                }else{
                    a=(curr+1-i);
                    b=i;
                }
                cnt++;
            }
            if(!k) break;
            curr++;
        }
        System.out.println(a+"/"+b);
    }
}
