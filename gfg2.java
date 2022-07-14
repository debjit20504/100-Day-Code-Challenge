public class gfg2 {
	public int solve(int n) {
		int a=0,k=0;
		for(int i=0;i<n;i++) {
			i*=k;
			System.out.println(i);
			if(a==10) {
				break;
			}
			a++;
		}
		return 0;
	}
}