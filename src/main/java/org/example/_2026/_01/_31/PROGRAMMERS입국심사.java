package org.example._2026._01._31;

import java.util.Arrays;

public class PROGRAMMERS입국심사 {
    public static void main(String[] args) {
        PROGRAMMERS입국심사 pro = new PROGRAMMERS입국심사();
        pro.solution(10, new int[]{6, 8, 10});
    }
    public long solution(int n, int[] times) {

        Arrays.sort(times);

        long left = 0; long right = (long) n * times[times.length-1];
        long answer = 0;

        while(left <= right){
            long tmp = (left+ right)/2;

            long count = 0;
            for(int i : times){
                count += tmp / i;
            }

            if(n <= count){
                answer = tmp;
                right = tmp - 1;
            }

            else {
                left = tmp + 1;
            }
        }

        return answer;
    }
}
