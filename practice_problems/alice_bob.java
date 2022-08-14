import java.util.*;
public class alice_bob {
	public static void main(String[] args) {
		List<Integer> boxes = new ArrayList<>();
		Scanner scn = new Scanner(System.in);
		System.out.print("No of boxes: ");
		int ask_no = scn.nextInt();
		for(int i=0;i<ask_no;i++){
			int ask = scn.nextInt();
			boxes.add(ask);
		}
		int k = solve(boxes);
		System.out.println(k);
	}
	public static int solve(List<Integer> boxes) {
		int[] new_box = new int[boxes.size()];
		for(int j=0;j<boxes.size();j++){
			int temp=0;	
			for(int i=j;i<boxes.size();i++){
				temp += boxes.get(i);
				if(temp%3 == 0){
					new_box[j] = temp;
				}
			}
		}
		Arrays.sort(new_box);
		return new_box[boxes.size()-1];
	}
}