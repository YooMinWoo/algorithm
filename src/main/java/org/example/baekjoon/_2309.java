package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] 난쟁이_리스트 = new int[9];
        int total = 0;
        for(int i=0; i<9; i++){
            난쟁이_리스트[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(난쟁이_리스트);
        int[] correctNum = findDwarf(난쟁이_리스트);

        for(int i : correctNum){
            System.out.println(난쟁이_리스트[i]);
        }
    }

    public static int[] findDwarf(int[] dwarfList){
        int[] correctNum = new int[7];
        for(int i=0; i<8; i++){
            for(int j=i+1; j<9; j++){
                int result = 0;
                int idx = 0;
                for(int k=0; k<9; k++){
                    if(k == i || k == j) continue;
                    correctNum[idx++] = k;
                }
                for(int correct : correctNum){
                    result += dwarfList[correct];
                }
                if(result == 100) return correctNum;
            }
        }
        return correctNum;
    }
}
