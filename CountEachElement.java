package arrayPractise;

public class CountEachElement {
	public void count(int []arr) {
		boolean []visited = new boolean[arr.length];
		for(int i = 0; i < arr.length; i++) {
			if(visited[i] == true) {
				continue;
			} 
			int count = 1;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					count++;
					visited[j] = true;
				}
			}
			System.out.print(arr[i]+ "->" + count+"  ");
		}
	}
}
