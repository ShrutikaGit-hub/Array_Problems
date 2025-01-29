package arrayPractise;

public class LinearSearch {
	public int search(int []arr, int val) {
		for(int i = 0; i < arr.length; i++) {
			if(val == arr[i]) {
				return i;
			}
		}return -1;
	}
}
