package com.company;

public class Main {

    public static void main(String[] args) {
	    Queue queue = new Queue();
        System.out.println(queue.isEmpty());
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Top element is " + queue.peek());
        System.out.println("Size is " + queue.getSize());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
