public class power {
	public int solve(int base, int exp) {
		if(exp < 0) {
			return -1;
		}
		if(base == 0 || exp == 1) {
			return base;
		}
		if(exp == 0) {
			return 1;
		}
		return base * solve(base, exp-1);
	}
}