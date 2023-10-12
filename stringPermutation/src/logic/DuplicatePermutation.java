package logic;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class DuplicatePermutation {

	private DuplicatePermutation() {
		
		throw new AssertionError("Cannot be instantiated");
	}
	
	public static Set<String> permute(String str){
		
		if(str==null || str.isEmpty()) {
			
			// 혹은 throw IllegalArgumentException 발생
			return Collections.emptySet();
		}
		return permute("", str);
	}
	
	private static Set<String> permute(String prefix, String str){
		
		Set<String> permutations = new HashSet<>();
		
		int n = str.length();
		
		if(n==0) {
			
			permutations.add(prefix);
		} else {
			
			for(int i = 0 ; i < n ; i ++) {
				
				permutations.addAll(permute(prefix+str.charAt(i), str.substring(i+1, n) + str.substring(0, 1)));
			}
		}
		return permutations;
	}
}
