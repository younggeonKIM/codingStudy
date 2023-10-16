package logic;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> results = OpenCloseBracket.embrace(3);
		
		System.out.println("Output : "+results);
	}

}
