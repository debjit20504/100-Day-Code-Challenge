public class fibonaci {
	public int solve(int n) {
		if(n==2) {
			return 1;
		}
		return n+solve(n-1); 
	}
}