package logic;

public class Main {

	public static void main(String[] args) {
		
		// 15명 중 1명만 남을 때까지 세 번째 사람을 제거. 생존자는 5번
		int n =15;
		int k = 3;
		
		System.out.println("Using recursion! Survivor: " + JosephusProblem.josephus(n, k) + "\n");
		
		JosephusProblem.printJosephusProblem(n, k);
	}

}
