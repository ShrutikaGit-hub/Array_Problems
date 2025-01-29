package arrayPractise;

public class SecondLargest {
	public int largest(int arr[]) {
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		int min = arr[0];
		for(int j = 0; j < arr.length; j++) {
			if(max > arr[j] && min < arr[j]) {
				min = arr[j];
			}
		}
		return min;
	}
}
