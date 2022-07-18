public class gfg5 {
	public int solve(int n) {
		int i = 1, s = 1;
		while(s <= n) {
			i++;
			s += i;
			System.out.println("*");
		}
	}
}