class gcd {
	public static void main(String[] args) {
		public int solve(int a, int b) {
			if(b == 0) {
				return a;
			}
			return gcd(b, b%10);
		}
	}
}