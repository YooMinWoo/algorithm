package org.example._2026._01._31;

public class PROGRAMMERSK번째수 {
    public static void main(String[] args) {
        PROGRAMMERSK번째수 c = new PROGRAMMERSK번째수();
        c.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int answerIdx = 0;
        for (int[] command : commands) {
            int start = command[0];
            int end = command[1];
            int curr = command[2];

            int[] ints = new int[end - start + 1];
            int cnt = 0;
            for(int i=start-1; i<end; i++){
                ints[cnt] = array[i];
                cnt++;
            }
            for(int i=0; i<ints.length - 1; i++){
                int idx = i;
                for(int j=i+1; j<ints.length; j++){
                    if(ints[idx] > ints[j]) idx = j;
                }
                int a = ints[i];
                int b = ints[idx];

                ints[i] = b;
                ints[idx] = a;
            }
            answer[answerIdx] = ints[curr - 1];
            answerIdx++;
        }
        return answer;
    }

}
