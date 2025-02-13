package com.tit.queueinterface;

import java.util.*;

public class BinaryConversion {
    public static List<String> generateBinaryNumbers(int N) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        queue.add("1");

        for (int i = 0; i < N; i++) {
            String front = queue.poll(); // Get the front element
            result.add(front); // Store the binary number

            queue.add(front + "0");
            queue.add(front + "1");
        }

        return result;
    }

    public static void main(String[] args) {
        int N = 5;
        List<String> binaryNumbers = generateBinaryNumbers(N);
        System.out.println(binaryNumbers);
    }
}

