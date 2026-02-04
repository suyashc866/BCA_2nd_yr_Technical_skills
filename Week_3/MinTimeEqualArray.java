// Given an integer array A of size N. In one second, you can increase the value of one element by 1. 
// Find the minimum time in seconds to make all elements of the array equal.

// ============================================================================================================================

// Obv:- 

// 	To minimize time, make all elements equal to the maximum element in the array.


// Approach
// 		a. Find the maximum element in the array.
// 		b. For every element, calculate how much it needs to be increased to reach the maximum.
// 		c. Sum all those differences.
// 	That sum is the minimum time (in seconds).



// Example

// 	Input
	
// 		A = [2, 4, 1, 3]
// 	Step 1: Find maximum
	
// 		max = 4
// 	Step 2: Calculate increments
	
// 		(4 - 2) = 2
// (4 - 4) = 0
// (4 - 1) = 3
// (4 - 3) = 1
// 	Step 3: Sum
	
// 		Total time = 2 + 0 + 3 + 1 = 6 seconds

// ============================================================================================================================




public class MinTimeEqualArray {

    public static int minTime(int[] A) {
        int max = A[0];

        // Step 1: Find maximum element
        for (int i = 1; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }

        // Step 2: Calculate total time
        int time = 0;
        for (int i = 0; i < A.length; i++) {
            time += (max - A[i]);
        }

        return time;
    }

    public static void main(String[] args) {
        int[] A = {2, 4, 1, 3};
        System.out.println("Minimum time: " + minTime(A));
    }
}

// ============================================================================================================================

// TODO:- 
// Given an array of integers A, find and return the product array of the same size where the ith element of the product array will be equal to the product of all the elements divided by the ith element of the array.
// Note: It is always possible to form the product array with integer (32 bit) values. Solve it without using the division operator.

// Input Format
// The only argument given is the integer array A.
// Output Format
// Return the product array.


// For Example
// Input 1:
//     A = [1, 2, 3, 4, 5]
// Output 1:
//     [120, 60, 40, 30, 24]
// Input 2:
//     A = [5, 1, 10, 1]
// Output 2:
//     [10, 50, 5, 50]


// ============================================================================================================================