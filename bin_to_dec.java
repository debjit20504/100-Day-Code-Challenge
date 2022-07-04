public class bin_to_dec {
	public int solve(int n) {
		if(n == 0) {
			return n;
		}
		return n/2 + solve(n%2);
	}
}