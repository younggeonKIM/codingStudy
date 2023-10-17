package logic;

public class Main {

	private static final int STEPS = 10;
	public static void main(String[] args) {
		
		int count =Stairs.count(STEPS);
		System.out.println("Count: " + count);
		
		int countMemo = Stairs.countViaMemoization(STEPS);
		System.out.println("Count via memo: "+countMemo);
	}

}
