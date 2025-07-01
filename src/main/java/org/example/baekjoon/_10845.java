package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10845 {

    static QueueNode first;
    static QueueNode end;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String[] s = br.readLine().split(" ");
            if(s[0].equals("push")){
                push(Integer.parseInt(s[1]));
            } else if (s[0].equals("pop")) {
                pop();
            } else if (s[0].equals("size")) {
                size();
            } else if (s[0].equals("empty")) {
                empty();
            } else if (s[0].equals("front")) {
                front();
            } else if (s[0].equals("back")) {
                back();
            }
        }
        System.out.println(sb.toString());
    }

    static void push(int num){
        if(end == null){
            first = new QueueNode(num, null);
            end = first;
        } else {
            QueueNode nextNode = new QueueNode(num, null);
            end.next = nextNode;
            end = nextNode;
        }
    }

    static void pop(){
        if(end == null) {
            sb.append(-1 + "\n");
            return;
        }
        sb.append(first.value + "\n");
//        System.out.println(first.value);
        first = first.next;
        if(first == null){
            end = null;
        }
    }

    static void empty(){
        if(first == null) {
//            System.out.println(1);
            sb.append(1 + "\n");
            return;
        }
        sb.append(0 + "\n");
    }

    static void size(){
        int cnt = 0;
        QueueNode current = first;
        while(current != null){
            cnt++;
            current = current.next;
        }
        sb.append(cnt + "\n");
    }

    static void front(){
        if(first == null){
            sb.append(-1 + "\n");
            return;
        }
        sb.append(first.value + "\n");
    }

    static void back(){
        if(end == null){
            sb.append(-1 + "\n");
            return;
        }
        sb.append(end.value + "\n");
    }
}

class QueueNode{
    int value;
    QueueNode next;

    public QueueNode(int value, QueueNode next) {
        this.value = value;
        this.next = next;
    }
}