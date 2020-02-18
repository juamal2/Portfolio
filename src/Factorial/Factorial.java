package Factorial;

import tasks.Find;

public class Factorial {
	public static int factorial(int i) {
		int result = i;
		i--;
		while (i > 0) {
			result = result * i;
			i--;
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		System.out.println(Factorial.factorial(5));
	}

}
