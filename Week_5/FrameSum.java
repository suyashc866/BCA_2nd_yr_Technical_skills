import java.util.*;
	public class FrameSum {
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
		for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
				if(i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    sum += matrix[i][j];
                }
		}
        }
		System.out.println(sum);
    }
}
