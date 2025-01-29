package arrayPractise;

public class PairsofArray {
	public String pairs(int arr[]) {
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < arr.length; i++) {
			int current = arr[i];
			for(int j = i + 1; j < arr.length; j++) {
				result.append("(").append(current).append(",").append(arr[j]).append(")");
			}
		}
		return result.toString();
	}
}