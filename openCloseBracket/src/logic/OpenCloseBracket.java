package logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OpenCloseBracket {

	private OpenCloseBracket() {
		
		throw new AssertionError("Cannot be instantiated");
	}
	public static List<String> embrace(int n){
		
		if(n<=0) {
			
			return Collections.emptyList();
		}
		List<String> results = new ArrayList<>();
		embrace(n, n, new char[n*2], 0, results);
		
		return results;
	}
	private static void embrace(int leftHand, int rightHand, char[] str, int index, List<String>results) {
		
		if(rightHand < leftHand || leftHand < 0) {
			
			return;
		}
		
		if(leftHand == 0 && rightHand == 0) {
			
			// 유효한 조합을 찾았기 때문에 저장합니다.
			results.add(String.valueOf(str));
		} else {
			
			// 왼쪽 중괄호를 추가합니다.
			str[index] = '{';
			embrace (leftHand - 1, rightHand, str, index+1, results);
			
			// 오른쪽 중괄호를 추가합니다.
			str[index]='}';
			embrace (leftHand , rightHand-1, str, index+1, results);
		}
	}
	
	
	
	
	/*private OpenCloseBracket() {
		
		throw new AssertionError("Cannot be instantiated");
	}
	public static void getBracketCombi(int times, String str, Set<String> brackets) {
		
		if(times<0) {
			
			throw new IllegalArgumentException("Times cannot be negative");
		}
		for(int i = 0 ; i<times;i++) {
			
			if(str.toCharArray().length==times*2) {
				
				return;
			} else {
				
				
			}
		}
	}
	public static 
	
	public static String openBracket(String comb) {
		
		comb+='{';
		return comb;
	}
	public static String closeBracket(String comb) {
		
		comb+='}';
		return comb;
	}*/
}
