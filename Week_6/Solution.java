// Given a string A consisting only of '(' and ')'.
// You need to find whether parentheses in A are balanced or not, if it is balanced then return 1 else return 0.

// Input Format
// First argument is an string A.


// Output Format
// Return 1 if parantheses in string are balanced else return 0.


// Example Input
// Input 1:
//  A = "(()())"
// Input 2:
//  A = "(()"


// Example Output
// Output 1:
//  1
// Output 2:
//  0


// //=========================================================================================================
// • Algorithm 

// • Push ( into the stack.
// • When ) appears, pop from the stack.
// • If the stack becomes empty when trying to pop → not balanced.
// • After processing the whole string, if the stack is empty → balanced.

//=========================================================================================================

import java.util.Stack;

public class Solution {

    public int solve(String A) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } 
            else if (ch == ')') {
                if (stack.isEmpty()) {
                    return 0;
                }
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            return 1;
        } 
        else {
            return 0;
        }
    }
}
