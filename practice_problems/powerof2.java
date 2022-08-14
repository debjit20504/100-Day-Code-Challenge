public class powerof2 {
	public int solve(int n) {
		if(n < 1) {
			return 0;
		}
		else if(n == 1) {
			System.out.println(1);
			return 1;
		}
		else {
			var prev = solve(n/2);
			var cur = prev * 2;
			System.out.println(cur);
			return cur;
		}
	}
}