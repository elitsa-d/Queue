package com.company;

public class Queue {
    private Node head;
    private Node tail;
    private int size;

    public Queue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        }

        return false;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);

        if (this.isEmpty()) {
            this.head = newNode;
        } else {
            this.tail.setNext(newNode);
        }

        this.tail = newNode;
        this.size++;
    }

    public int dequeue() {
        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("The queue is already empty!");
        }

        int value = this.head.getValue();
        this.head = this.head.getNext();

        if (this.head == null) {
            this.tail = null;
        }

        this.size--;
        return value;
    }

    public int peek() {
        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException();
        }

        return this.head.getValue();
    }

    public void delete() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
}
