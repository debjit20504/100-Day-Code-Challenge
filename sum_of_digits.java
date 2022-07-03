public class sum_of_digits {
	public int solve(int n) {
		if(n < 0) {
			return -1;
		}
		if(n == 0) {
			return 0;
		}
		return n%10 + solve(n/10);
	}
}