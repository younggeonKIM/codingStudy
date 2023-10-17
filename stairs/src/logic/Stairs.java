package logic;

public class Stairs {

	private Stairs() {
		
		throw new AssertionError("Cannot be instantiated");
	}
	
	// 100% 재귀 알고리즘
	public static int count(int n) {
		
		if(n==0) {
			
			return 1;
		} else if(n<0) {
			
			return 0;
		}
		return count(n-1)+count(n-2)+count(n-3);
	}
	
	// 메모이제이션을 통한 재귀 알고리즘 최적화
	public static int countViaMemoization(int n) {
		
		int[] cache = new int[n+1];
		return count(n, cache);
	}
	
	private static int count(int n, int[] cache) {
		
		if(n==0) {
			
			return 1;
		} else if(n<0) {
			
			return 0;
		} else if(cache[n] > 0) {
			
			return cache[n];
		}
		cache[n] = count(n-1, cache) + count(n-2, cache) + count(n-3, cache);
		
		return cache[n];
	}
	/*public static void stepUpStairs(int stairs, int[] comb, Set<int[]> combSet) {
		
		if(stairs < 0) {
			
			throw new IllegalAccessError("stairs cannot be negative");
		}
		if(stairs==0) {
			
			combSet.add(comb);
		} else {
			
			
		}
	}
	public static void oneStep(int stairs) {
		
		
	}*/
}
