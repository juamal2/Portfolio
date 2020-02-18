package oddity;

import java.util.ArrayList;
import java.util.List;

public class Oddity {
	public static List<Integer> oddity (int[] nums){
		List<Integer> result = new ArrayList<>();
		for (int i : nums) {
			if (i % 2 > 0) {result.add(i);}
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		
	}
}
