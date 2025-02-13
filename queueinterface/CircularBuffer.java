package com.tit.queueinterface;

import java.util.Arrays;

class CircularBuffer {
    private int[] arr;
    private int front, rear, size, capacity;

    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(int x) {
        rear = (rear + 1) % capacity;
        arr[rear] = x;

        if (size < capacity) {
            size++;
        } else {
            front = (front + 1) % capacity;
        }
    }

    public int dequeue() {
        if (size == 0) {
            return -1;
        }
        int removed = arr[front];
        front = (front + 1) % capacity;
        size--;
        return removed;
    }


    public void display() {
        if (size == 0) {
            System.out.println("Buffer is empty.");
            return;
        }

        System.out.print("Buffer: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(3);

        buffer.enqueue(1);
        buffer.enqueue(2);
        buffer.enqueue(3);
        buffer.display();

        buffer.enqueue(4);
        buffer.display();

        buffer.dequeue();
        buffer.display();

        buffer.enqueue(5);
        buffer.display();
    }
}
