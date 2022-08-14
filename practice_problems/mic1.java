public class mic1 {
	public int solve(int x, int y) {
		while(true) {
			if(x>y) {
				x = x-y;
			}
			if(x<y) {
				y = y-x;
			}
			if(x==y) {
				return x;
			}
		}
	}
}
