// Arrays



// PROBLEM : 1   

// Given N array, count number of elements having at least 1 element greater than itself.


// A = [-3, 2, 6, 8, 4, 8, 5]

// 	Ans = 5
	
	
	
	
		
// Observation : 1. For every max element there won't be any element greater than itself.

// 													OR
			
// Observation : 2. For every other element, we will have at least one element that is greater than it.
			
			
			
			
			
// Pseudocode :

// 			1. Iterate and find the max of the array.
			
// 			2. Iterate and get the number of element that are not equal to max.
			
			
			
// 			intSolve(int arr[]){
			
// 				// Find the max
				
// 				max = -inf
				
// 				for (i = 0; i < n; i ++){
// 					If (max < arr[i])
// 						max = a[i]
// 					}
// 				count = 0
// 				for (i = 0; i < n; i ++){
// 					If (max = arr[i])
// 						count = count +1 
// 					}
// 				return count 
// 			}
			
			
// 			Time Complexity : O(N)
			
// 			Space Complexity : O(1)
			
			
// 	CODE 
				
				
public class CountElements {

    public static void main(String[] args) {
        int[] A = {-3, 2, 6, 8, 4, 8, 5};

        int max = A[0];


        for (int i = 1; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }


        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != max) {
                count++;
            }
        }

        System.out.println("Answer = " + count);
    }
}
