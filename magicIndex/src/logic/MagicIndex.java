package logic;

public class MagicIndex {

	MagicIndex(){
		throw new AssertionError("Cannot be instantiated");
	}
	
	public static int find(int[] arr) {
		
		if(arr==null) {
			
			return -1;
		}
		return find(arr, 0, arr.length-1);
	}
	
	private static int find(int[] arr, int startIndex, int endIndex) {
		
		if(startIndex > endIndex) {
			
			return -1; // 유효하지 않은 인덱스를 반환한다.
		}
		
		// 인덱스 개수를 반으로 줄인다.
		int middleIndex = (startIndex + endIndex) / 2;
		
		// 중간 인덱스의 값을 확인한다.
		int value = arr[middleIndex];
		
		// 배열의 왼쪽 영역을 검색한다.
		int leftIndex = find(arr, startIndex, Math.min(middleIndex	-1, value));
		if (leftIndex >= 0) {
			
			return leftIndex;
		}
		
		// 값과 인덱스가 같다면 마법의 인덱스이다.
		if(value==middleIndex) {
			
			return middleIndex;
		}
		
		// 배열의 오른쪽 영역을 검색한다.
		return find(arr, Math.max(middleIndex+1, value), endIndex);
	}
	
	
	
	
	
	
	/*protected int[] arr;
	
	public void getMagicIndexElement (int[] arr, int increNum) {
		
		
		this.arr=arr;
		for(int i = 0 ; i < arr.length ; i ++) {
			
			arr[i]=i;
		}
	}*/
}
