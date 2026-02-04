// Given N array elements, check if there exits  a pair (i,j) such that arr[i] + arr[j] == K and i != j.

// Note : I and j are index value K is given sum.

// ==============================================================================================================

// Arr = [3 , -2, 1,  4, 3, 6, 8]

// K = 10

 
// Idea : 1 

// 	Run a loop for i -> all indices.
	
// 	Nested loop for j -> all indices.
	
// 	And compute the sum of all pairs.
	

	
	// N = arr.length()
	
	// boolean Checksum(int arr[], int k){
	
	// 	for(i = 0 ; i<N ; i++){
	// 		for(j = 0; j<N ; j++){
	// 			if (i != j and arr[i] + arr[j] == k)
	// 				return True
	// 			}
				
	// 		}
	// 	return False 
	// }
// ==============================================================================================================			
				
// Idea : 2 

// 		boolean Checksum(int arr[], int k){
		
// 			for(i = 0 ; i<N ; i++){
// 				for(j = 0; j<i ; j++){
// 					if (arr[i] + arr[j] == k)
// 						return True
// 					}
					
// 				}
// 			return False 
// 		}
		


// 		Time Complexity : O(N^2)
		
// 		Space Complexity : O(1)

// ==============================================================================================================
		
// Idea 1: Brute Force (i and j both from 0 to N-1)
		
class CheckPairSum {

    static boolean checkSum(int[] arr, int k) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] + arr[j] == k) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3, -2, 1, 4, 3, 6, 8};
        int k = 10;

        System.out.println(checkSum(arr, k));
    }
}


// Idea 2: Optimized Brute Force (avoid duplicate pairs)

// class CheckPairSum {

//     static boolean checkSum(int[] arr, int k) {
//         int n = arr.length;

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < i; j++) {
//                 if (arr[i] + arr[j] == k) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         int[] arr = {3, -2, 1, 4, 3, 6, 8};
//         int k = 10;

//         System.out.println(checkSum(arr, k));
//     }
// }

