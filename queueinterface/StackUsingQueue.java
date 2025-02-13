package com.tit.queueinterface;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue <T> {
    Queue<T> q1 = new LinkedList<>();
    Queue<T> q2 = new LinkedList<>();

    public void push(T data){
        q2.add(data);

        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }
        Queue<T> temp = new LinkedList<>();
        temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public T pop(){
        return q1.remove();
    }

    public T peek(){
        return q1.peek();
    }
    public static void main(String[] args) {

        StackUsingQueue<Integer> s1 = new StackUsingQueue<>();
        s1.push(2);
        s1.push(3);
        s1.push(5);

        System.out.println(s1.peek());

    }
}
