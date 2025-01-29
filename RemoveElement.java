package arrayPractise;

public class RemoveElement {
	public int[] remove(int []arr, int index) {
		int []newarr = new int[arr.length-1];
		int j = 0;
		for(int i = 0; i < arr.length; i++) {
			if(index != i) {
				newarr[j] = arr[i];
				j++;
			}
		}
		return newarr;
	}
}
