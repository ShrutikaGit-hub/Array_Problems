package arrayPractise;

public class FindElement {
	public int find(int []arr, int num) {
		for(int i = 0; i < arr.length; i++) {
			if(num == arr[i]) {
				return i;
			}
		}
		return -1;
	}
}
