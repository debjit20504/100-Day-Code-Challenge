public class bin_to_dec {
	public int solve(int n) {
		if(n < 2) {
			return 1;
		}
		return n%2 + 10*solve(n/2);
	}
}