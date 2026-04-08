// Queue Introduction
// A Queue is a linear data structure that follows the FIFO (First In First Out) principle.
// The element inserted first is removed first.
// Example:

// Queue: [10, 20, 30]
// Dequeue → 10

// 2.  Examples
// 	1. Ticket Counter Line
// The first person in line gets served first. 
// 	2. Printer Queue
// Documents are printed in the order they are sent. 
// 	3. Call Center System
// Calls are handled based on arrival order. 
// 	4. Food Ordering System
// Orders are processed in sequence. 

// 3. Queue Operations
// Operation	Description
// enqueue()	Insert element at rear
// dequeue()	Remove element from front
// peek()	Get front element
// isEmpty()	Check if queue is empty
// isFull()	Check if queue is full (array)



// Implement a Queue using an array in Java.
//  The queue should support the following operations:

// 	1. enqueue(int x) – Insert an element into the queue 
// 	2. dequeue() – Remove and return the front element from the queue 
// 	3. peek() – Return the front element without removing it 
// 	4. isEmpty() – Check whether the queue is empty 
// 	5. display() – Print all elements of the queue


class Queue {
    int arr[];
    int front;
    int rear;
    int capacity;

    // constructor
    Queue(int size) {
        capacity = size;
        arr = new int[capacity];
        front = 0;
        rear = -1;
    }

    // enqueue (insert)
    void enqueue(int x) {
        if (rear == capacity - 1) {
            System.out.println("Queue is Full");
            return;
        }
        rear++;
        arr[rear] = x;
    }

    // dequeue (remove)
    int dequeue() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int val = arr[front];
        front++;
        return val;
    }

    // peek
    int peek() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    // display
    void display() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}






// Main Function

class Main {
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display(); // 10 20 30

        System.out.println(q.dequeue()); // 10

        q.display(); // 20 30

        System.out.println(q.peek()); // 20
    }
}

