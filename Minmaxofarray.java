package arrayPractise;
import java.util.ArrayList;

public class Minmaxofarray {
	public ArrayList<Integer> maxmin(int []arr) {
		ArrayList<Integer> minmax = new ArrayList<>();
		int max = arr[0];
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
				if(max < arr[i]) {
					max = arr[i];
				}
				else if(min>arr[i]) {
					min = arr[i];
				}
		}
		minmax.add(min);
		minmax.add(max);
		return minmax;
	}
}
