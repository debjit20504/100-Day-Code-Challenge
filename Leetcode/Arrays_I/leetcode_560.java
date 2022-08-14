public class leetcode_560 {
	public static void main(String[] args) {
		int[] ar = {1,2,3};
		int k = subarraySum(ar);
	}

	public static int subarraySum(int[] num) {
		for(int i=0;i<num.length;i++) {
			for(int j=i; j<num.length;j++) {
				System.out.println(num[i]+", "+num[j]);
			}
			System.out.println();
		}
		return 0;
	}
}

// About | Resume | Work | Interest | Contact