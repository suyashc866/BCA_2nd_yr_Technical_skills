// Given an expression string A, examine whether the pairs and the orders of “{“,”}”, ”(“,”)”, ”[“,”]” are correct in A.
// Refer to the examples for more clarity.


// nput Format
// The first and the only argument of input contains the string A having the parenthesis sequence.


// Output Format
// Return 0 if the parenthesis sequence is not balanced.
// Return 1 if the parenthesis sequence is balanced.


// Example Input
// Input 1:
//  A = {([])}
// Input 2:
//  A = (){
// Input 3:
//  A = ()[] 


// Example Output
// Output 1:
//  1 
// Output 2:
//  0 
// Output 3:
//  1 

//=========================================================================================================


import java.util.Stack;

public class Solution1 {

    public int solve(String A) {

        int N = A.length();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < N; i++) {

            char ch = A.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            else {

                if (stack.isEmpty()) {
                    return 0;
                }

                if ((ch == ')' && stack.peek() == '(') ||
                    (ch == '}' && stack.peek() == '{') ||
                    (ch == ']' && stack.peek() == '[')) {

                    stack.pop();
                }
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
