public class sum_of_digits {
	// public int solve(int n) {
	// 	if(n < 0) {
	// 		return -1;
	// 	}
	// 	if(n == 0) {
	// 		return 0;
	// 	}
	// 	return n%10 + solve(n/10);
	// }
	public int solve(int n) {
		if(n < 0) {
			return -1;
		}
		if(n==2) {
			return 2;
		}
		if(n == 0 || n == 1) {
			return n;
		}
		return (2*n) + solve((2*n)-1);
	}
}