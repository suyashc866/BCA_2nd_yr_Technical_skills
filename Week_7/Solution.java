
// Given a string A denoting an expression. It contains the following operators '+', '-', '*', '/'.
// Check whether A has redundant braces or not.
// NOTE: A will be always a valid expression and will not contain any white spaces.



// Example Input
// Input 1:
//  A = "((a+b))"
// Input 2:
//  A = "(a+(a+b))"


// Example Output
// Output 1:
//  1
// Output 2:
//  0


// We use a stack to detect redundant braces:
// 	• Traverse the string
// 	• Push characters into stack until ')' is found
// 	• When ')' appears:
// 		○ Pop elements until '(' is found
// 		○ Check if there was at least one operator (+ - * /) inside
// 		○ If no operator found → redundant braces


//=========================================================================================================

import java.util.*;

public class Solution {
      public int braces(String A) {
        Stack<Character> stack = new Stack<>();
        Set<Character> op = new HashSet<>(Arrays.asList('+', '-', '*', '/'));

        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);

            if (op.contains(ch) || ch == '(') {
                stack.push(ch);

            } else if (ch == ')') {
                if (!stack.isEmpty() && op.contains(stack.peek())) {
                    stack.pop(); // remove operator
                    stack.pop(); // remove '('
                } else {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        String A1 = "((a+b))";
        String A2 = "(a+(a+b))";

        System.out.println(obj.braces(A1)); // 1
        System.out.println(obj.braces(A2)); // 0
    }
}
