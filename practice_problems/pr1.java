public class pr1 {
	public String solve(String s, String p) {
		int temp1=0, tmp=0;
		for(int i=0;i<p.length();i++) {
			int temp = s.indexOf(p.charAt(i));
			if(temp!=-1) {
				temp1 = temp;
			}
			if(temp==-1) {
				return "NO";
			}
			if(temp<temp1){
				return "NO";
			}
		}
		return "YES";
	}
}