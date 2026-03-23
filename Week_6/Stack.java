// Stack 
  
// A Stack is a linear data structure that follows the LIFO (Last In First Out) principle.
// This means the last element inserted is the first one to be removed.

// Real-life example:
// A stack of plates in a cafeteria. The last plate placed on the stack is the first plate removed.
// Example stack:

// Top
// | 30 |
// | 20 |
// | 10 |
// If we insert 40, it will be placed at the top.


//=========================================================================================================

// Basic Stack Operations

// 1. Push
// Adds an element to the top of the stack.
// Example:

// push(10)
// push(20)
// push(30)

// Stack becomes:

// Top
// | 30 |
// | 20 |
// | 10 |

// 2. Pop

// Removes the top element from the stack.
// Example:

// pop()
// If stack was:

// Top
// | 30 |
// | 20 |
// | 10 |
// After pop:

// Top
// | 20 |
// | 10 |

// 3. isEmpty

// Checks whether the stack is empty or not.
// Returns:
// 	• true → stack is empty
// 	• false → stack has elements

//=========================================================================================================

// Stack Implementation in Java



class Stack {
    
    int arr[];
    int top;
    int capacity;

    // Constructor
    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Push operation
    void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        arr[top] = x;
        System.out.println(x + " pushed into stack");
    }

    // Pop operation
    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int value = arr[top];
        top--;
        return value;
    }

    // Peek operation
    int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    // Size of stack
    int size() {
        return top +  1;
    }

    // Check if empty
    boolean isEmpty() {
        return top == -1;
    }

    // Display stack
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        Stack s = new Stack(5);

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        System.out.println("Top element: " + s.peek());

        System.out.println("Popped: " + s.pop());

        s.display();

        System.out.println("Size of stack: " + s.size());
    }
}
