public class gfg1 {
	public int solve(int n) {
		int i,j,k=0;
		for (i=n/2; i<=n; i++) {
			for (j=2; j<=n; j=j*2) {
				k = k + n/2;
				System.out.print("k = "+k+", ");
				System.out.print("j = "+j+", ");
			}
			System.out.print("i = "+i+", ");
			System.out.println();
		}
		return 0;
	}
}