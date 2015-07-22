/**
 * 
 * Solution to the "Coconuts nd monkeys math problem from the youtube channel numberphile 
 */
public class CoconutsAndMonkeys {

	public static void main(String[] args) {
		
		int cocos = 10; 
		
		while (!check(++cocos)); 
		
		System.out.println(cocos);
	}
	
	private static boolean check(int start) {
		
		int tester, i; 
		
		if (start % 5 != 1)
			return false;
		
		tester = start; 
		
		for (i = 0; i < 4; i++) {
			tester = (tester - 1) * 4 / 5;
			if (tester % 5 != 1)
				return false;
		}	
		return true; 
	}
}
