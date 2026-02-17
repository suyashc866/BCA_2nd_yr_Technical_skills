import java.util.*;
	public class CoreSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
        int cols = sc.nextInt();
		int[][] matrix = new int[rows][cols];
		
		// Input matrix
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
		int sum = 0;
		// Core elements traversal
        for(int i = 1; i < rows - 1; i++) {
            for(int j = 1; j < cols - 1; j++) {
                sum += matrix[i][j];
            }
        }
		System.out.println(sum);
    }
}
