public class gcd {
	public int solve(int a, int b) {
		if(a < 0 || b < 0) {
			return -1;
		}
		if(b == 0) {
			return a;
		}
		return solve(b, a%b);
	}
}