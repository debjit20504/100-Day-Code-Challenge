public class gcd {
	public int solve(int a, int b) {
		if(b == 0) {
			return a;
		}
		return solve(b, a%b);
	}
}