package tasks;

public class Find {
	public static boolean find(String s, int i, char c) {
		return	(s.charAt(i-1) == c);

	}
	public static void main(String[] args) {
		System.out.println(Find.find("hello", 2, 'e'));
	}

}
