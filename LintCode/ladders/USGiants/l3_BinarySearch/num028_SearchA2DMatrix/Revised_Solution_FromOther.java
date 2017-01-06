package ladders.USGiants.l3_BinarySearch.num028_SearchA2DMatrix;

public class Revised_Solution_FromOther {
	/**
	 * @param matrix, a list of lists of integers
	 * @param target, an integer
	 * @return a boolean, indicate whether matrix contains target
	 */
	public boolean searchMatrix(int[][] matrix, int target) {
		// write your code here
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;

		int rows = matrix.length, cols = matrix[0].length;
		int lo_i = 0, hi_i = rows * cols - 1;

		while (lo_i <= hi_i) {
			int mid_i = lo_i + (hi_i - lo_i) / 2;
			int mid_v = matrix[mid_i / cols][mid_i % cols];
			if (mid_v == target) return true;
			else if (mid_v < target) lo_i = mid_i + 1;
			else hi_i = mid_i - 1;
		}
		return false;
	}
}
//http://www.lintcode.com/en/problem/search-a-2d-matrix/
/*
Search a 2D Matrix

Description
Notes
Testcase
Judge
Write an efficient algorithm that searches for a value in an m x n matrix.

This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
Have you met this question in a real interview? Yes
Example
Consider the following matrix:

[
   [1, 3, 5, 7],
   [10, 11, 16, 20],
   [23, 30, 34, 50]
]
Given target = 3, return true.

Challenge 
O(log(n) + log(m)) time

Tags 
Binary Search Matrix
*/
//from http://www.cnblogs.com/springfor/p/3857959.html
//time complexity: O(log(rows*columns))