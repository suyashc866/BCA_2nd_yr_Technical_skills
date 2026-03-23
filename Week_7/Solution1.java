//  Double Character Trouble

// You have a string, denoted as A.

// To transform the string, you should perform the following operation repeatedly:
// 1. Identify the first occurrence of consecutive identical pairs of characters within the string.
// 2. Remove this pair of identical characters from the string.
// 3. Repeat steps 1 and 2 until there are no more consecutive identical pairs of characters.
// The final result will be the transformed string.


// Problem Constraints
// 1 <= |A| <= 100000


// Input Format
// First and only argument is string A.


// Output Format
// Return the final string.


// Example Input
// Input 1:
//  A = "abccbc"
// Input 2:
//  A = "ab"


// Example Output
// Output 1:
//  "ac"
// Output 2:
//  "ab"


//=========================================================================================================
// • Start 
// • Create an empty stack (or string / StringBuilder) 
// • Traverse the string from left to right 
// • For each character: 
// 	• If stack is not empty AND top of stack == current character
// → Remove (pop) the top element 
// 	• Else
// → Add (push) current character into stack 
// • Repeat until all characters are processed 
// • Convert stack to string 
// • Return the result 
// • End

//=========================================================================================================



public class Solution1 {
    public String solve(String A) {
        StringBuilder s = new StringBuilder();

        for (char ch : A.toCharArray()) {
            int n = s.length();

            if (n > 0 && s.charAt(n - 1) == ch) {
                s.deleteCharAt(n - 1);  // remove pair
            } else {
                s.append(ch);          // add char
            }
        }

        return s.toString();
    }
}