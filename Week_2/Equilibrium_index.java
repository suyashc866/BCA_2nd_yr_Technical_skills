


// Ques : Equilibrium Index 

// Given N array elements, Count no. of Equilibrium Index.

// An Index is said to be  Equilibrium index if 

// Sum of all elements left of  ith index = Sum of all elements right of ith index.



// Note :

//   if i == 0  , leftSum = 0

//   if i == N-1   , righttSum = 0

// ============================================================================================


//   Logic & Pseudocode 



// For every index if ith index is Equilibrium or not.


// Solve () {


// 	Count = 0
// 	For (I = 0 ; I < N; I ++){
	
// 	Left_sum =  sum[0,i-1]  => pf[i-1]
// 	Right_sum = sum[i+1, N-1]  => pf[N-1] - pf[i]
	
// 	If (Left_sum  == Right_sum)
// 		Count += 1
// }

// Return count 
// }

// ============================================================================================


// Algorithm 

// • Read the array arr and find its length n.
// • Create a prefix sum array pf and store cumulative sums of arr.
// • Initialize count = 0.
// • For each index i, calculate
// leftSum = pf[i−1] (or 0 if i = 0) and
// rightSum = pf[n−1] − pf[i].
// If leftSum == rightSum, increment count and finally return count.


// ============================================================================================






public class Equilibrium_index {

    public static void main(String[] args) {

        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        int n = arr.length;

        // Step 1: Construct prefix sum array
        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int count = 0;

        // Step 2: Check equilibrium index
        for (int i = 0; i < n; i++) {

            int leftSum;
            int rightSum;

            if (i == 0) {
                leftSum = 0;
            } else {
                leftSum = prefix[i - 1];
            }

            if (i == n - 1) {
                rightSum = 0;
            } else {
                rightSum = prefix[n - 1] - prefix[i];
            }

            if (leftSum == rightSum) {
                count++;
            }
        }

        System.out.println("Number of Equilibrium Index: " + count);
    }
}
