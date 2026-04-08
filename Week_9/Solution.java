
// Problem Description

// Given an integer A, you have to find the Ath Perfect Number.
// A Perfect Number has the following properties:
// 	• It comprises only 1 and 2.
// 	• The number of digits in a Perfect number is even.
// 	• It is a palindrome number.
// For example, 11, 22, 112211 are Perfect numbers, where 123, 121, 782, 1 are not.






// Problem Constraints
// 1 <= A <= 100000


// Input Format
// The only argument given is an integer A.


// Output Format
// Return a string that denotes the Ath Perfect Number.


// Example Input
// Input 1:
//  A = 2
// Input 2:
//  A = 3


// Example Output
// Output 1:
//  22
// Output 2:
//  1111


// Example Explanation
// Explanation 1:
// First four perfect numbers are:
// 1. 11
// 2. 22
// 3. 1111
// 4. 1221
// Return the 2nd Perfect number.
// Explanation 2:
// First four perfect numbers are:
// 1. 11
// 2. 22
// 3. 1111 
// 4. 1221
// Return the 3rd Perfect number.






// Steps:
// 	1. Create a queue 
// 	2. Insert "1" and "2" 
// 	3. Repeat A times: 
// 		○ Remove front element → temp 
// 		○ Create palindrome → temp + reverse(temp) 
// 		○ Add new numbers: 
// 			§ temp + "1" 
// 			§ temp + "2" 
// 	4. Return last generated palindrome



import java.util.*;

class Solution {
    public String solve(int A) {
        Queue<String> queue = new ArrayDeque<>();
        
        queue.add("1");
        queue.add("2");
        
        String ans = "";
        
        while (A > 0) {
            String temp = queue.poll();
            
            // create palindrome
            String rev = new StringBuilder(temp).reverse().toString();
            ans = temp + rev;
            
            // generate next numbers
            queue.add(temp + "1");

            queue.add(temp + "2");
            
            A--;
        }
        
        return ans;
    }
}




// What is StringBuilder 

// StringBuilder is a class in Java used to modify strings without creating new objects repeatedly.

// Problem with String

// In Java, String is immutable (cannot be changed).

// String s = "Hello";
// s = s + " World";

// What happens internally:
// 	• "Hello" is created 
// 	• "Hello World" is created as a new object 
// 	• The old object is discarded 
// Each modification creates a new object, which is inefficient.

//  StringBuilder

// StringBuilder sb = new StringBuilder("Hello");
// sb.append(" World");

// What happens:
// 	• The same object is modified 
// 	• No new object is created 
// This makes it faster and memory efficient.


// 1. new StringBuilder(temp)

// 	• Converts the string temp into a StringBuilder object 
// 	• String is immutable (cannot be changed), but StringBuilder is mutable 
// Example:

// temp = "123"
// StringBuilder = "123"

// 2. .reverse()

// 	• Reverses the characters inside the StringBuilder 
// Example:

// "123" → "321"

// 3. .toString()

// 	• Converts the StringBuilder back into a String 
// Result:

// "321"



// Queue = [ ,"21","22", "111", "112"]
// A = 4 times
// Temp =  "12"
// Palin = "12" + "21" = "1221"
// Temp  + "1" = "111"
// Temp  + "2" = "112"
