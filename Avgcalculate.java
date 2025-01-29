package arrayPractise;

public class Avgcalculate {
	public float avg(int []arr) {
		float avg = 0;
		for(int i = 0; i < arr.length; i++) {
			avg = avg + arr[i];
		}
		return avg/arr.length;
	}
}
