package arrayPractise;

public class Sumofarray {
	public int sumation(int []arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
}
