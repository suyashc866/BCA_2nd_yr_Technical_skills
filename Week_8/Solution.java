// Problem Description

// Given an integer, A. Find and Return first positive A integers 
// in ascending order containing only digits 1, 2, and 3.

// A = 5

// 1 2 3 11 12 13 21 22  23 31 32 33 111 112 113 

// 1 * 10 + 1 = 11 
// 1 * 10 + 2 = 12
// 1 * 10 + 3 = 13  
// 2 * 10 + 1 = 21 
// 2 * 10 + 2 = 22 
// 2 * 10 + 3 = 23 




// Input Format
// The only argument given is integer A.


// Output Format
// Return an integer array denoting the first positive A integers in ascending order containing only digits 1, 2 and 3.


// Example Input
// Input 1:
//  A = 3
// Input 2:
//  A = 7


// Example Output
// Output 1:
//  [1, 2, 3]
// Output 2:
//  [1, 2, 3, 11, 12, 13, 21]


// Example Explanation
// Explanation 1:
//  Output denotes the first 3 integers that contains only digits 1, 2 and 3.
// Explanation 2:
//  Output denotes the first 7 integers that contains only digits 1, 2 and 3.


// Algotihtm 

// • Initialize queue with 1, 2, 3 
// • Repeat A times: 
// 	• Remove front element temp 
// 	• Add it to result 
// 	• Push temp*10 + 1, temp*10 + 2, temp*10 + 3 into queue 
// • Return result




// ArrayList<Integer> ans = new ArrayList<>();

// • ArrayList<Integer>
// → This means we are creating a dynamic list that will store Integer values. 
// • ans
// → This is the name of the variable (used to store the result). 
// • new ArrayList<>()
// → This creates a new empty ArrayList object in memory.








// Queue<Integer> queue = new LinkedList<>();

// • Queue<Integer>
// → Declares a Queue that will store integers
// → Queue follows FIFO (First In First Out) 
// • queue
// → Variable name 
// • new LinkedList<>()
// → Creates a LinkedList object which is used to implement the Queue


import java.util.*;

class Solution {
    public ArrayList<Integer> solve(int A) {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        while (A > 0) {
            int temp = queue.poll();
            ans.add(temp);

            for (int i = 1; i <= 3; i++) {
                queue.add(temp * 10 + i);
            }

            A--;
        }

        return ans;
    }
}








