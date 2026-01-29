
// LECTURE  : 1(Prefix Sum)

// Given N array elements & Q queries  on same array.
// For each query calculate sum of all elements in given array. - [L, R]

// Note : L & R are indices such that L <= R.

// arr[10] = [-3,  6,  2,  4,  5,  2, 8,  -9,  3, 1]


// L       R
// 4     8   --> 9 
// 3     7   --> 10
// 1     3   --> 12
// 0     4   -->14


// solve(int []arr){
// 	Q = input()
// 	While (Q > 0){
// 		L, R  = input()
// 		# Compute Sum from L to R.  
// 		Q --
// 	}
// }  TC: O(N* Q)

// =============================================================================================================

// Q2 Given Indian Cricket Team scores for first 10 overs of batting. After every over, total score is given as:

// Overs.     I    2      3       4      5      6        7       8       9        10
// Scores    2    8.    14.   29    31    49     65.    79     88       97


// Total runs scored in last over:    97 -  88      --->  9 runs

// Total runs scored in 7th over:    score [7] -  score[6]    -->65 - 49     --> 16

// Total runs scored in overs 6th to 10th:     score [10] -  score[5]   --> 97 - 31   -->66

// Total runs scored in overs 3rd to 6th:       score [6] -  score[2].    -->49 - 8   --> 41



// [I, J ]   Both Include -->  Score [J]  - Score[I-1]     (Both I and J are Included)

// (Construct Prefix Sum and leader of an array)

// How to Construct the prefix array

// Arr  <- input

// Pf[N]

// PF[0] = Arr[0]

// For ( I = 0 ; I < N ; I++){

// 	Pf[i] = Pf [i-1]  + arr[i]
	
// }

// TC : O(N)

// SC : O(N)

// =============================================================================================================


// Pre[i]  = sum[0  ,  I ]

// Pf[0]   = arr [0]

// Pf[1]   = arr [0]  +  arr [1]

// Pf[2]   = arr [0]  +  arr [1]  +  arr [2]

// Pf[2] =  Pf[1] + arr[ 2]


// Pf[3]   = arr [0]  +  arr [1]  +  arr [2] + arr[3]

// Pf[3] =  Pf[2] + arr[ 3]



// Pf[i] = Pf[i-1]  + arr[i]

// =============================================================================================================

// Solve (int []arr){
// 	// construct prefix array             ---> O(N)
	
// 	Q = input()
	
// 	While (q > 0){
	
// 		L, R = input()
		
// 		//Compute Sum from L to R. ( Pre[R] - Pre[L-1].               --> O(1)
		
// 		Q--
		
// 	}
// }


// TC : O( N +  Q)
// SC : O(1)






public class prefix_sum {

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10};
        int n = arr.length;

        // Prefix sum array
        int[] prefix = new int[n];

        // First element
        prefix[0] = arr[0];

        // Construct prefix sum
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Print prefix sum array
        System.out.println("Prefix Sum Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(prefix[i] + " ");
        }
    }
}