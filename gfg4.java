public class gfg4 {
	public int solve(int n) {
		int count = 0;
		for (int i=0; i < n ; i++) {
			for (int j=i; j<i*i; j++) {
				if(j%i == 0) {
					for (int k=0; k<j; k++) {
						System.out.print("*");
					}
				}
			}
		}
	}
}