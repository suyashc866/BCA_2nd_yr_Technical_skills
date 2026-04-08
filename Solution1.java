// Given an array of integers A and an integer B, we need to reverse the order of the first B elements of the array, 
// leaving the other elements in the same relative order. 

// NOTE: You are required to the first insert elements into an auxiliary queue then perform Reversal of first B elements.


// Problem Constraints
// 1 <= B <= length of the array <= 500000
// 1 <= A[i] <= 100000


// Input Format
// The argument given is the integer array A and an integer B.


// Output Format
// Return an array of integer after reversing the first B elements of A using queue.


// Example Input
// Input 1:
//  A = [1, 2, 3, 4, 5]
//  B = 3
// Input 2:
//  A = [5, 17, 100, 11]
//  B = 2


// Example Output
// Output 1:
//  [3, 2, 1, 4, 5]
// Output 2:
//  [17, 5, 100, 11]




// Steps:
// 	1. Insert all elements of array A into a queue. 
// 	2. Remove first B elements from queue and push them into a stack. 
// 	3. Pop all elements from stack and add back to queue (this reverses first B elements). 
// 	4. For remaining elements (N - B): 
// 		○ Remove from front of queue and add back to rear (to maintain order). 
// 	5. Convert queue back to array and return.



import java.util.*;

public class Solution1 {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        Queue<Integer> queue = new ArrayDeque<>();  
        Stack<Integer> stack = new Stack<>();

        // Step 1: Insert into queue
        for (int i = 0; i < A.size(); i++) {
            queue.add(A.get(i));
        }

        // Step 2: First B elements into stack
        for (int i = 0; i < B; i++) {
            stack.push(queue.remove());
        }

        // Step 3: Push back to queue (reversed)
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        // Step 4: Move remaining elements to back
        int remaining = A.size() - B;
        for (int i = 0; i < remaining; i++) {
            queue.add(queue.remove());
        }

        // Step 5: Convert to ArrayList
        ArrayList<Integer> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            result.add(queue.remove());
        }

        return result;
    }
}


