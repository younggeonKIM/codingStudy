package logic;

import java.util.ArrayDeque;
import java.util.Queue;

public class JosephusProblem {
	
	private JosephusProblem() {
		
		throw new AssertionError("Cannot be instantiated");
	}

	// 일반 재귀 알고리즘
	public static int josephus(int n, int k) {
		
		if( k <=0 || n <=0) {
			
			return -1;
		}
		
		if (n==1) {
			
			return 1;
		} else {
			
			return (josephus(n-1, k) + k -1) % n +1;
		}
	}
	// 큐 이용하기
	public static void printJosephusProblem(int n, int k) {
		
		if (n<=0 || k<=0) {
			
			throw new IllegalArgumentException("The n and k numbers must be > 0");
		}
		
		Queue<Integer> circle = new ArrayDeque<>();
		
		for (int i = 1; i <= n; i++) {
			
			circle.add(i);
		}
		
		while (circle.size() != 1) {
			
			for(int i =1; i <= k; i++) {
				
				int eliminated = circle.poll();
				if(i==k) {
					
					System.out.println("Eliminated: " + eliminated);
					break;
				}
				circle.add(eliminated);
			}
		}
		System.out.println("Using queue! Survivor: " + circle.peek());
	}
	
	/*
		public static List<Integer> getSurvivorList(int popNum) {
			List<Integer> popList = new ArrayList<Integer>();
			for (int i = 0; i < popNum ; i++) {
				
				popList.add(i+1) ;
			}
			return popList;
		}
		
		public void getSurvivor(int popNum, int interval, List<Integer> pL) {
			
			int startPoint = (int)((Math.random()*popNum)+1);
			int deadNum = 0;
			int survivorNum = 0;
			pL.remove(startPoint);
			while (startPoint * interval <= popNum) {
	
				System.out.println("죽은 생존자의 번호는 " +pL.get(startPoint*interval) +"입니다.");
				pL.remove(startPoint*interval);
				deadNum++;
			}
			popNum -=deadNum;
			if(popNum ==1 )	{
				
				for (int i = 0; i < pL.size() ; i++) {
					
					survivorNum= pL.get(i);
				}
				System.out.println("생존자 번호는 " + survivorNum +"입니다.");
				return;
			} else {
	
				getSurvivor(popNum, interval, pL);
				return ;
			}
		
			
		public static void main(String[] args) {
			
			JosephusProblem jp = new JosephusProblem();
			int res =jp.getSurvivor(14, 14);
			System.out.println(res);
		}
	
		}*/
}
