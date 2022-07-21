import java.util.*;
public class leetcode_118 {
	public static void main(String[] args) {
		List<List<Integer>> max =  new ArrayList<List<Integer>>();
		max = generate(5);
		System.out.println(max);
	}

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> row, pre = null;
		for (int i=0; i<numRows; i++) {
			row = new ArrayList<Integer>();
			for (int j=0; j<=i; j++) {
				if(j==0 || j==i) {
					row.add(1);
				}
				else
					row.add(pre.get(j-1)+pre.get(j));
			}
			pre = row;
			res.add(row);
		}
		return res;
	}
}

// Time complexity - O(numRows*numRows)
// Space complexity - O(numRows*numRows)