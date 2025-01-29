package arrayPractise;

public class MergeArray {
	public int[] merge(int []arr, int []arr1) {
		int []mergearr = new int[arr.length+arr1.length];
		for(int i = 0; i < arr.length; i++) {
			mergearr[i] = arr[i];
		}
		for(int j = 0; j < arr1.length; j++) {
			if(mergearr[j] != arr1[j]) {
				mergearr[arr.length+j] = arr1[j];
			}
		}
		
		return mergearr;
	}
}
