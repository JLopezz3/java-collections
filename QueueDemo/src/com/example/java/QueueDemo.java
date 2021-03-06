package com.example.java;

import java.util.PriorityQueue;

public class QueueDemo {

    public static void main(String[] args) {

        //FIFO
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 10; i > 0 ; i--) {
            queue.add(i);
        }

        // Queue: (Front) 10 9 8 7 6 5 4 3 2 1 (Rear)
        // PriorityQueue sorts the data for us
        // Queue: (Front) 1 2 3 4 5 6 7 8 9 10 (Rear)  | Sorted Queue the Actual One

        // Peeking -> Obtaining the head of Queue
        // Polling -> Remove the head of Queue

        System.out.println("Queue Size is: " + queue.size());
        System.out.println("Head of Queue is: " + queue.peek()); // Head of Queue : 1

        queue.poll(); // Removing the head 1
        System.out.println("Queue Size After Poll is: " + queue.size());

        System.out.println("Head of Queue is: " + queue.peek()); // Head of Queue : 2
    }
}
