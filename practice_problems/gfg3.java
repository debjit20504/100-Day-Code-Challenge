public class gfg3 {
	public int solve(int n) {
		int value=0,i,j;
		for (i=0; i<n; i++) {
			for (j=0; j<i; j++) {
				value+=1;
				System.out.print("value = "+value+", ");
			}
			System.out.println();
		}
		return 0;
	}
}