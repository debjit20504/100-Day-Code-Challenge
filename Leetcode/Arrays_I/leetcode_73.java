import java.util.*;
public class leetcode_73 {
	public static void main(String[] args) {
		int arr[][] = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
		setZeros(arr);
		System.out.println("The Final Matrix is ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void setZeros(int[][] matrix) {
		int row = matrix.length;
		int col = matrix[0].length;
		int dum1[] = new int[row];
		int dum2[] = new int[col];
		Arrays.fill(dum1,-1);
		Arrays.fill(dum2,-1);
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				if(matrix[i][j] == 0) {
					dum1[i] = 0;
					dum2[j] = 0;
				}
			}
		}
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				if(dum1[i] == 0 || dum2[j] == 0) {
					matrix[i][j] = 0;					
				}				
			}			
		}
	}
}

// Time complexity = O(row*col)
// Space complexity = O(row)